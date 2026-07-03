
public class patternconcept{
    public static void main(String[]args){
        /*int n=4;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){                    //* * * * 
                                                            //* * * * 
                                                            //* * * * 
                                                            //* * * *
            System.out.print("* ");
            }
            System.out.println();

        }*/
       /*int n=5;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){                                    //* 
                                                                  //* * 
                                                                  //* * * 
                                                                  //* * * * 
                                                                  //* * * * * 
            System.out.print("* ");
        }
        System.out.println();
       }*/

        /*int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");                      //*****
                                                           //*****
                                                          //*****
                                                         //*****
                                                        //*****

            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
       /*int n=5;
       for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){                  //* * * * * 
                                                        //* * * * 
                                                        //* * * 
                                                        //* * 
                                                        //* 
            System.out.print("* ");
        }
        System.out.println();
        
       }*/
      /*int n=4;
      for(int i=1;i<=n;i++){
        //SPACE
        for(int j=1;j<=i-1;j++){
            System.out.print("  ");              // * * * * * * * 
                                                   // * * * * * 
                                                     // * * * 
                                                       // * 

        }
        //STAR
        for(int j=1;j<=2*n-2*i+1;j++){
            System.out.print("* ");
        }
        System.out.println();
      }*/
    /*int n=4;
     for (int row=1;row<=n;row++){
        //SPACES
        for(int col=1;col<=n-row;col++){                // * 
                                                       //* * * 
                                                     //* * * * * 
                                                   //* * * * * * * 
            System.out.print("  ");
        }
        //STAR
        for(int col=1;col<=2*row-1;col++){
            System.out.print("* ");
        }
        System.out.println();
     }*/


       /*int n=4;
        for (int row=1;row<=n;row++){
            for(int col=1;col<=6;col++){
                if(row==1||row==n){
                   System.out.print("*");     ******
                                              *    *
                                              *    *
                                              ******
                }
                else{
                    if(col==1||col==6){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }*/


            /*int n=4;
            for(int row=1;row<=n;row++){
                for(int col=1;col<=n-row;col++){      * 
                                                    *   *
                                                  *       *
                                                * * * * * * * 
                    System.out.print("  ");
                }
                
                if(row==1||row==n){
                    for(int col=1;col<=2*row-1;col++){
                        System.out.print("* ");
                    }
                }
                else{
                    System.out.print("* ");
                    for(int col=1;col<=2*row-3;col++){
                        System.out.print("  ");
                    }
                    System.out.print("*");
                    

                }
                System.out.println();
            }*/

                /*int n=4;
            for(int row=1;row<=n;row++){
                for(int col=1;col<=n-row;col++){      
                    System.out.print("  ");
                }
                
                if(row==1){
                    for(int col=1;col<=2*row-1;col++){
                        System.out.print("* ");
                    }
                }
                else{
                    System.out.print("* ");
                    for(int col=1;col<=2*row-3;col++){
                        System.out.print("  ");
                    }
                    System.out.print("*");
                    

                }
                System.out.println();
            }                                                * 
                                                           *   *
                                                         *       *
                                                        *         *
                                                         *       * 
                                                           *   *
                                                             * 
            
            for(int row=1;row<=n-1;row++){
                for(int col=1;col<=row;col++){
                    System.out.print("  ");
                }
                if(row==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("* ");
                    for(int col=1;col<=2*(n-row)-3;col++){
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                }
                 System.out.println();
            }*/  
         
  }
}