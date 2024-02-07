public class Update {
    String version;
    String cameraStability;
    String wifiConnectivity;
    String security;

    public Update() {
        this.version = "Version:5050";
        this.cameraStability = "High";
        this.wifiConnectivity = "High";
        this.security = "High";
    }

    @Override
    public String toString() {
        return "Update{" +
                "version='" + version + '\'' +
                ", cameraStability='" + cameraStability + '\'' +
                ", wifiConnectivity='" + wifiConnectivity + '\'' +
                ", security='" + security + '\'' +
                '}';
    }
}
