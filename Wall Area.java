public class WallArea {
    private double width;
    private double height;


    public WallArea() {
        this(0,0);
        System.out.println("Constructor with no params called");
    }

    public WallArea(double width, double height) {
        if(width >= 0 && height >= 0){
            this.width = width;
            this.height = height;
        }
        if (width < 0){
            this.width = 0;
            this.height = height;
        }
        if ( height < 0){
            this.height = 0;
            this.width = width;
        }
        if ( height < 0 && width < 0){
            this.height = 0;
            this.width = 0;
        }
    }


    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if(width < 0 ){
            this.width = 0.0d;
        }
        else{
            this.width = width;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if (height < 0){
            this.height = 0.0d;
        }
        else {
            this.height = height;
        }
    }

    public double getArea(){
        return this.width * this.height;
    }
}
