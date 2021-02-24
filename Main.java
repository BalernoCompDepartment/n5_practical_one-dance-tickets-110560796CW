class Main {
  public static void main(String[] args) {

    // 1. Get group name 
   String groupName = Keyboard.getText("please enter the groups name");

    //2. Get a valid number of pupils in the group  
    int numInGroup = Keyboard.getInt("how many people are in your group");
    while (numInGroup < 4 || numInGroup > 10){
      Screen.display("invalid amount","Error");
     numInGroup =  Keyboard.getInt("please enter a valid number");
    }
    //3. Loop for each pupil in the group 
    String [] names = new String[numInGroup]; 
    double [] ticketCost = new double[numInGroup]; 
    //4. Get pupil name 
    for (int index = 0; index < names.length; index ++) {
        names[index] = Keyboard.getText("please enter the names of the students that are in the group");
        }

    //5. Decide and store ticket cost for each pupil`
      for (int index = 0; index < names.length; index ++) {
        String ticketType = Keyboard.getText("would " + names[index] + " like a photo");
        if(ticketType.equals("yes")){
          ticketCost[index] = (4.99);
        }else{
          ticketCost[index] = (3.00);
        } 
      } //6. End loop
      //7.Display results
String output = " ";
output = "Group name:   " + groupName + "\n" + "number in group:  " + numInGroup + "\n" ;
//display loop
 for(int amountDisplayed = 0; amountDisplayed < numInGroup; amountDisplayed ++){

      output = output + names[amountDisplayed] + ticketCost[amountDisplayed] + "\n" ;

  }
      
      Screen.display(output, "dance ticket cost"); 
}
   

    


    
  }