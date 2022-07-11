public class Shap {
    private String color = "green";
    private  boolean filled = true;

    public Shap(){

    }
    public Shap(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public boolean getFilled(){
        return this.filled;
    }

    @Override
    public String toString() {
        return "Shap{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

