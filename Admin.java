public class Admin {
    private String username = "admin";
    private String password = "123456789";

    private static Admin ADMIN_INSTANCE;

    public static Admin getInstance(){

        if(ADMIN_INSTANCE == null){

            ADMIN_INSTANCE = new Admin();

        }
       return ADMIN_INSTANCE;
    }

    public boolean check(String username, String password){
        if(this.username.equals(username) && this.password.equals(password))
            return true;

        return false;
    }

    public void setAdminInstance(String username, String password){
        this.password = password;
        this.username = username;
    }
}

