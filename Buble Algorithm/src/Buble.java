import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Buble {
public ArrayList<Integer> sort(ArrayList<Integer>dataList)
{
    for(int i = 0 ; i<dataList.size()-1;i++)
    {
        boolean swap = false;

        for (int i_2 = 0 ; i_2< dataList.size()-1-i;i_2++)
        {
            if(dataList.get(i_2) >dataList.get(i_2+1))
            {
                Collections.swap(dataList,i_2,i_2+1);
                swap = true;
            }
        }
        if(swap == false)
        {
            break;

        }

    }
    return dataList;
}

    public static void main(String[] args) {

        ArrayList<Integer> dataList = new ArrayList<Integer>();

       for(int i = 0 ; i <100 ; i++)
       {
           dataList.add((int)(Math.random()*100));
           Buble bSort = new Buble();
           bSort.sort(dataList);
       }
       System.out.println(dataList);


    }

}
