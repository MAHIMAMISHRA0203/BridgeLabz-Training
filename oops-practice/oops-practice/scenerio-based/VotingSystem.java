
// ---------- Abstraction ----------
interface ElectionService {
    void registerVoter(Voter voter);
    void addCandidate(Candidate candidate);
    void castVote(int voterId, int candidateId) throws DuplicateVoteException;
    void declareResult();
}

// ---------- Custom Exception ----------
class DuplicateVoteException extends Exception {
    DuplicateVoteException(String msg) {
        super(msg);
    }
}

// ---------- Voter Class ----------
class Voter {
    int voterId;
    String name;
    boolean hasVoted = false;

    Voter(int voterId, String name) {
        this.voterId = voterId;
        this.name = name;
    }
}

// ---------- Candidate Class ----------
class Candidate {
    int candidateId;
    String name;
    int voteCount = 0;

    Candidate(int candidateId, String name) {
        this.candidateId = candidateId;
        this.name = name;
    }
}

// ---------- Vote Class ----------
class Vote {
    int voterId;
    int candidateId;

    Vote(int voterId, int candidateId) {
        this.voterId = voterId;
        this.candidateId = candidateId;
    }
}

// ---------- Election Implementation ----------
class ElectionSystem implements ElectionService {

    Voter[] voters = new Voter[10];
    Candidate[] candidates = new Candidate[10];
    int voterCount = 0;
    int candidateCount = 0;

    public void registerVoter(Voter voter) {
        voters[voterCount++] = voter;
        System.out.println("Voter registered: " + voter.name);
    }

    public void addCandidate(Candidate candidate) {
        candidates[candidateCount++] = candidate;
        System.out.println("Candidate added: " + candidate.name);
    }

    public void castVote(int voterId, int candidateId)
            throws DuplicateVoteException {

        Voter voter = null;
        Candidate candidate = null;

        for (int i = 0; i < voterCount; i++) {
            if (voters[i].voterId == voterId) {
                voter = voters[i];
                break;
            }
        }

        for (int i = 0; i < candidateCount; i++) {
            if (candidates[i].candidateId == candidateId) {
                candidate = candidates[i];
                break;
            }
        }

        if (voter.hasVoted) {
            throw new DuplicateVoteException("Voter has already voted!");
        }

        voter.hasVoted = true;
        candidate.voteCount++;
        System.out.println("Vote casted successfully by " + voter.name);
    }

    public void declareResult() {
        System.out.println("\n--- Election Results ---");
        for (int i = 0; i < candidateCount; i++) {
            System.out.println(
                candidates[i].name + " : " + candidates[i].voteCount + " votes"
            );
        }
    }
}

// ---------- Main Class ----------
public class Main {
    public static void main(String[] args) {

        ElectionService election = new ElectionSystem();

        // Register voters
        election.registerVoter(new Voter(1, "Mahima"));
        election.registerVoter(new Voter(2, "Aman"));

        // Add candidates
        election.addCandidate(new Candidate(101, "Candidate A"));
        election.addCandidate(new Candidate(102, "Candidate B"));

        try {
            election.castVote(1, 101);
            election.castVote(2, 102);
            election.castVote(1, 102);
        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        election.declareResult();
    }
}
