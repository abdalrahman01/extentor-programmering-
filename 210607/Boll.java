public class Boll{
    private double x;
    private double y;
    private double vx;
    private double vy;
    private double r;

    public Boll(double x, double y, double radie, double speed_x, double speed_y){
        this.x = x;
        this.y = y;
        r = radie;
        vx = speed_x;
        vy = speed_y;
    }

    private void updatePosition(double dt) {
        x += dt * vx;
        y += dt * vy;
    }

    public double[] get_position() {
        double[] position = {x,y};
        return position;
    }

    public double[] get_new_position(double dt) {
        double[] position = {x + dt * vx, y + dt * vy};
        return position;
    }

    public void bounce(double dt) {
        // undersöka om bollen som studsar är utanför den stora bollen efter att tiden dt har passerat. 
        double new_x = get_new_position(dt)[0];
        double new_y = get_new_position(dt)[1];
        if(new_x>=r || new_x<=-r || new_y >= r || new_y <= -r){


            // säkerställa att den studsande bollen faktiskt är inne i den stora bollen.
            if (x < r && x > -r && y < r && y > -r) {
                

                // Om detta gäller så studsar bollen mot (insidan) av den stora bollen. 
                
                
                // rotera med vinkeln -v
                x = x * Math.cos(-vx) - y * Math.sin(-vy);
                y = x * Math.sin(-vx) + y * Math.cos(-vy);

                // studsa 
                updatePosition(dt);


                // rotera tillbaka 
                x = x * Math.cos(vx) - y * Math.sin(vy);
                y = x * Math.sin(vx) + y * Math.cos(vy);

                updatePosition(dt);

                
            }
        }         
    }

}

