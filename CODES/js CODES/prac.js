var team = {
    participantOne: "Chandler",
    participantTwo: "Joey",
    print: function () {
                //console.log("Welcome " + this.participantOne + " " + this.participantTwo);

        /* TODO 1: 
        A. Define a function with identifier greetParticipants
        B. Pass the scope of the team object to greetParticipants function using bind() method
        C. The function greetParticipants must print the message to welcome both participants defined in the team object on the console, as shown in Problem Statement
   */
   var greetParticipants =   function(){
    
      console.log("Welcome " + this.participantOne + " " + this.participantTwo);

  }.bind(this);
  greetParticipants();
   
}
};
team.print();

let a = 5;

console.log(a);
