class RobotSafetyException extends Exception {
    public RobotSafetyException(String message) {
        super(message);
    }
}

class RobotHazardAuditor {

    public double CalculateHazardRisk(double armPrecision,
            int workerDensity,
            String machineryState)
            throws RobotSafetyException {

        // Validate arm precision
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException(
                    "Error: Arm precision must be 0.0-1.0");
        }

        // Validate worker density
        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException(
                    "Error: Worker density must be 1-20");
        }

        // Determine machine risk factor
        double machineRiskFactor;

        switch (machineryState) {
            case "Worn":
                machineRiskFactor = 1.3;
                break;
            case "Faulty":
                machineRiskFactor = 2.0;
                break;
            case "Critical":
                machineRiskFactor = 3.0;
                break;
            default:
                throw new RobotSafetyException(
                        "Error: Unsupported machinery state");
        }

        // Calculate and return hazard risk
        return (1 - armPrecision) * workerDensity * machineRiskFactor;
    }

    // Main method for testing
    public static void main(String[] args) {
        RobotHazardAuditor auditor = new RobotHazardAuditor();

        try {
            double risk = auditor.CalculateHazardRisk(0.8, 10, "Faulty");
            System.out.println("Hazard Risk Score: " + risk);
        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }
    }
}
