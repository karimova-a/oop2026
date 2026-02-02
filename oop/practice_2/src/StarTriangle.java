public class StarTriangle {
    private int width ;

    public StarTriangle(int width){
        this.width = width ;
    }

    public String toString() {
        String result = "" ;

        for(int i = 1; i <= width ;i++){
            for(int j = 1; j <= i; j++){
                result += "[*]" ;
            }
            if(i < width){
                result += "\n" ;
            }
        }

        return result ;

    }

    public static void main(String[] args){
        System.out.println("Star example: ") ;
        StarTriangle small = new StarTriangle(4) ;
        System.out.println(small.toString()) ;
    }

}
