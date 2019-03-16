package ch07;

public class LoginInfo {

    private UserInfo[] users;
    private int index;
    LoginInfo() {
        users = new UserInfo[10];
        index = 0;
    }
    public boolean login(String username, String password) {
        // 检查用户是否存在
        boolean exist = checkDb(username, password);
        if(exist) {
            System.out.println("登录成功！");
            // 把用户信息存到 users 里面
            if(index < 10) {
                users[index++] = new UserInfo(username, password);
            }
            return true;
        }else{
            System.out.println("登录失败！");
            return false;
        }

    }

    /**
     * 在数据库中确认用户是否存在（假的）
     * @return
     */
    public static boolean checkDb(String username, String password) {
        if(username == "djj" && password == "123") {
            return true;
        }else {
            return false;
        }
    }



    public static void main(String[] args) {
        LoginInfo online = new LoginInfo();
        online.login("djj", "123");
        online.login("djj", "1234");
    }
}

class UserInfo{
    String username;
    String password;

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }
}