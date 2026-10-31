function studentGradingSystem() {     
	const prompt = require("prompt-sync")();
    let studentNumber = Number(prompt("Enter number of student in class:"));     
    let subjectsOffered = Number(prompt("Enter the number of subject offered:"));      

    console.log("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");     
    console.log("Saved successfully");      

    let scores = [];     
    for (let index = 0; index < studentNumber; index++) {         
        scores[index] = [];                  
        console.log("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");         
        console.log("    Entering scores for Student " + (index + 1));         
        console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");          

        for (let count = 0; count < subjectsOffered; count++) {             
            let inputScore = Number(prompt("Enter score for subject " + (count + 1) + ":"));              

            while (inputScore < 0 || inputScore > 100) {                 
                console.log("Invalid score input. Try again!");                 
                inputScore = Number(prompt("Enter score for subject " + (count + 1) + ":"));             
            }                          

            scores[index][count] = inputScore;             
            console.log("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");             
            console.log("Saved successfully");         
        }     
    }      

    let total = [];     
    for (let index = 0; index < studentNumber; index++) {         
        let sum = 0;         
        for (let count = 0; count < subjectsOffered; count++) {             
            sum = sum + scores[index][count];         
        }         
        total[index] = sum;     
    }      

    let studentClassPosition = [];     
    for (let index = 0; index < studentNumber; index++) {         
        studentClassPosition[index] = 1;         
        for (let count = 0; count < studentNumber; count++) {             
            if (total[count] > total[index]) {                 
                studentClassPosition[index] = studentClassPosition[index] + 1;             
            }         
        }     
    }      

    console.log("\n=====================================================================");     
    console.log("                     STUDENT GRADING RESULT");          

    let headerRow = "  STUDENT   ";     
    for (let index = 0; index < subjectsOffered; index++) {         
        headerRow = headerRow + "  SUB" + (index + 1) + "  ";     
    }     
    headerRow = headerRow + "   TOTAL   AVERAGE  POSITION";     
    console.log(headerRow);     
    console.log("=====================================================================");      

    for (let index = 0; index < studentNumber; index++) {         
        let average = total[index] / subjectsOffered;         
        let dataRow = "STUDENT " + (index + 1) + "   ";          

        for (let count = 0; count < subjectsOffered; count++) {             
            dataRow = dataRow + "    " + scores[index][count] + "   ";         
        }          

        dataRow = dataRow + "    " + total[index] + "     " + average.toFixed(2) + "        " + studentClassPosition[index];         
        console.log(dataRow);     
    }     
    console.log("====================================================================="); 
}

studentGradingSystem();

