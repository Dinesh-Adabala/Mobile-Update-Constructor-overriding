public class Mobile {
   String camera;
   String sim;
   String theme;

   Update update;


    public Mobile(String camera, String sim, String theme, Update update) {
        this.camera = camera;
        this.sim = sim;
        this.theme = theme;
        this.update = update;
    }
    public Mobile(String camera, String sim, String theme){
        this(camera , sim,theme,new Update());
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "camera='" + camera + '\'' +
                ", sim='" + sim + '\'' +
                ", theme='" + theme + '\'' +
                ", update=" + update +
                '}';
    }
}
