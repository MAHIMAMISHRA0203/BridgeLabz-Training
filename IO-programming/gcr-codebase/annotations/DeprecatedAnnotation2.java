package annotations;
import java.lang.annotation.*;
class LegacyAPI{
	@Deprecated
	void oldFeatures() {
		System.out.println("I am old method");
	}
	void newFeatures() {
		System.out.println("I am new method");
	}
}
public class DeprecatedAnnotation2 {
	
public static void main(String args[]) {
	LegacyAPI legacyAPI=new LegacyAPI();
	legacyAPI.oldFeatures();
	legacyAPI.newFeatures();

	}
}
