/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */

public class StausUser 
{
enum Number{
"ZERO",
"ONE",
"TWO",
"THREE"
};
enum Status{"REJECTED","PENDING","PROCESSING","APPROVED"};
//   public void statusDetail()
//{
//switch(code.toUpperCase())
//        {
//        case "ZERO": System.out.println("REJECTED");
//        break;
//        case "ONE": System.out.println("PENDING");
//        break;
//        case "TWO":
//        System.out.println("PROCESSING");
//        break;
//        case "THREE": 
//            System.out.println("APPROVED");
//        break;
//        default:
//         System.out.println("NOT VALID CODE");
//        break;
//        }
//    System.out.println(User.values());
@Override
    public String toString()
    {
        return Number+Status;
    }
}
