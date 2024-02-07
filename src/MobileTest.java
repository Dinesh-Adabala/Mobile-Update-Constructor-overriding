public class MobileTest {
    public static void main(String[] args) {
        Update u = new Update();
        u.version = "version2050";
        u.cameraStability = "having some bugs";
        u.wifiConnectivity = "having some bugs";
        u.security ="having some bugs";
        Mobile oldMobile = new Mobile("65mp","Dual","Basic",u);
        System.out.println("old Mobile status "+oldMobile);
        Mobile updatedMobile = new Mobile("65mp","Dual","Natural");
        System.out.println("Updated Mobile status "+updatedMobile);
    }
}
