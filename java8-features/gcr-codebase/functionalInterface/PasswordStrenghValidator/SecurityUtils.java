package InterfacesFunctional.PasswordStrenghValidator;

 interface SecurityUtils {
   static boolean isStrong(String password) {
	   if(password.length()<8)
		   return false;
	   return true;
	   
   }
   
}
