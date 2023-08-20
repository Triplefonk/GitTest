import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class DOIT {
    public static void main(String[] args) throws IOException {
        BufferedReader triplefonk = new BufferedReader(new InputStreamReader(System.in));

        Integer [] io = new Integer[5];
        for (int i = 0; i < io.length; i++) {

            io[i] = Integer.parseInt(triplefonk.readLine());


        }
         /* comfortable way to reverse numbers */
        Arrays.sort(io, Collections.reverseOrder());
        System.out.println(Arrays.toString(io));

        /* Tough way to reverse numbers...

        if (io[0] < io[1] & io[0] < io[2] & io[0] < io[3] & io[0] < io[4]){
            if (io[1] < io[2] & io[1] < io[3] & io[1] < io[4]) {
                if (io[2] < io[3] & io[2] < io[4]){
                    if (io[3] < io[4]){

                        System.out.println(io[4]+" "+io[3]+" "+io[2]+" "+io[1]+" "+io[0]);
                        }
                    }
                }

            }

        if (io[1] < io[0] & io[1] < io[2] & io[1] < io[3] & io[1] < io[4]){
            if (io[0] < io[2] & io[0] < io[3] & io [0] < io[4]) {
                if (io [2] < io [3] & io[2] < io[4]){
                    if (io [3] < io [4]){
                        System.out.println(io[4] + " "+ io [3]+ " "+ io [2]+ " "+ io[0]+ " "+io [1]);
                    }
                }
            }
        }
        */


    }
}
