
def student_grading_system():

    student_number = int(input("Enter number of student in class: "))
    subjects_offered = int(input("Enter the number of subject offered: "))

    print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>")
    print("Saved successfully")

    scores = [[0] * subjects_offered for _ in range(student_number)]

    for index in range(student_number):
        print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
        print(f"    Entering scores for Student {index + 1}")
        print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

        for count in range(subjects_offered):
            while True:
                input_score = int(input(f"Enter score for subject {count + 1}: "))

                if input_score >= 0 and input_score <= 100:
                    break
                else:
                    print("Invalid score input. Try again!")

            scores[index][count] = input_score
            print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
            print("Saved successfully")

    total = []

    for count in range(student_number):
        total_sum = sum(scores[count])
        total.append(total_sum)

    student_class_position = [1] * student_number

    for count in range(student_number):
        for index in range(student_number):
            if total[index] > total[count]:
                student_class_position[count] += 1

    print("\n=====================================================================")
    print("\t\t     STUDENT GRADING RESULT")

    header = f"{'STUDENT':>12}"

    for index in range(subjects_offered):
        header += f"{f'SUB{index + 1}':>8}"

    header += f"{'TOTAL':>10}{'AVERAGE':>10}{'POSITION':>10}"

    print(header)
    print("=======================================================================")

    for count in range(student_number):
        average = total[count] / subjects_offered

        row = f"{f'STUDENT {count + 1}':>12}"

        for index in range(subjects_offered):
            row += f"{scores[count][index]:>8}"

        row += f"{total[count]:>10}{average:>10.2f}{student_class_position[count]:>10}"

        print(row)

    print("=====================================================================")


student_grading_system()

