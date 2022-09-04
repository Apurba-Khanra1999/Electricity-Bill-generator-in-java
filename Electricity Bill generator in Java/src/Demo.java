public class Demo {
    static double[] demo(double units){

        double[] total = new double[4];
        if(units>0 && units<=100){
            total[2] = units*1.50;
            total[3]=0;
        }
        else if(units>=101 && units<=200){
            total[0] = units*3.50;
            total[1] = total[0]+20;
            total[2]=total[1];
            total[3]=20;
        }
        else if(units>=201 && units<=500){
            total[0] = units*4.60;
            total[1] = total[0]+30;
            total[2]=total[1];
            total[3]=30;
        }
        else{
            total[0] = units*6.60;
            total[1] = total[0]+50;
            total[2]=total[1];
            total[3]=50;
        }

        return total;
        
    }
}
