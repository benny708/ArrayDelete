/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydelete;

/**
 *
 * @author User
 */
public class ArrayDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {5,4,7,6};
        int element = 7;
        int[] newArr = new int[arr.length - 1];
        int i=0;
        for (int j=0; j<arr.length;j++){
            if (element==arr[j]){
                continue;
            }else{
                newArr[i] = arr[j];
                i++;
            }
            
        }
        for (int x=0; x<newArr.length; x++){
            System.out.println(newArr[x]);
        }
    }
    
}
