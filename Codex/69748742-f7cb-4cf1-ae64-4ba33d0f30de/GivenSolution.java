import java.util.*;
class Main
{
    public static void main(String[] args)  
    {
      //Create the 1st linked list and take input as per user's choice
        LinkedList  list1 = new LinkedList();
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements do you want to add in 1st linked list?: ");
        int num = input.nextInt();
        System.out.print("Input numbers of 1st linked list in ascending order: ");
        for(int i=0;i<num;i++)
        {
         int element = input.nextInt();
         list1.add(element);
        }
        System.out.println();
       //System.out.println("Elements of 1st linked list are: ");
       //for(int i=0;i<list.size();i++){
       //System.out.println(list.get(i));}       
       //Convert the 1st linked list to arraylist
       List<Integer> list1_1 = new ArrayList<Integer>(list1);
       //Convert the arraylist to array using toArray method
        Object[] list1_1_1 = list1_1.toArray();
       //Copy elements from object array to integer array
        int[] list1_1_1_1 = new int[list1_1_1.length];
       	for (int i = 0; i < list1_1_1.length; i++)
		   	list1_1_1_1[i] = (int)list1_1_1[i];	   	
//Create the 2nd linked list and take input as per user's choice
        LinkedList list2 = new LinkedList();
        System.out.print("How many elements do you want to add in 2nd linked list?: ");
        int num1 = input.nextInt();
        System.out.print("Input numbers of 2nd linked list in ascending order: ");
        for(int i=0;i<num1;i++)
        {
         int element = input.nextInt();
         list2.add(element);
        }
        System.out.println();
       //System.out.println("Elements of 2nd linked list are: ");
       //for(int i=0;i<list1.size();i++){
       //System.out.println(list1.get(i));}       
       //Convert the 2nd linked list to arraylist
       List<Integer> list2_2 = new ArrayList<Integer>(list2);
       //Convert the arraylist to array using toArray method
        Object[] list2_2_2 = list2_2.toArray();
    	 //Copy elements from object array to integer array
	      int[] list2_2_2_2 = new int[list2_2_2.length];
        for (int i=0; i<list2_2_2.length; i++)
			       list2_2_2_2[i] = (int)list2_2_2[i];      
       int[] mergedArray = merge(list1_1_1_1, list2_2_2_2);
      System.out.print("Merged list: ");
      for (int i=0; i<mergedArray.length; i++)
      {
        System.out.print(mergedArray[i] + " ");
      }    
    }
//Create java method to merge the elements of 2 linked lists
public static int[] merge(int[] list1_1_1_1, int[] list2_2_2_2) 
    {
//Create an array listmerged of length list1_1_1_1.length+list2_2_2_2.length and arrange the eliments in ascending order
      int[] listmerged = new int[list1_1_1_1.length + list2_2_2_2.length];
      int i = 0, j = 0, k = 0;
      while (i < list1_1_1_1.length && j < list2_2_2_2.length)
      {
          if (list1_1_1_1[i] < list2_2_2_2[j])
          {
              listmerged[k] = list1_1_1_1[i];
              i++;
          }
          else
          {
              listmerged[k] = list2_2_2_2[j];
              j++;
          }
          k++;
      }
      while (i < list1_1_1_1.length)
      {
          listmerged[k] = list1_1_1_1[i];
          i++;
          k++;
      }
      while (j < list2_2_2_2.length)
      {
          listmerged[k] = list2_2_2_2[j];
          j++;
          k++;
      }
      return listmerged;
    }
}