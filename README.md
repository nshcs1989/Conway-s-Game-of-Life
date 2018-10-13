# Conway-s-Game-of-Life
The game of life is a simulation game developed by mathematician "John Conway" as a research model on the life cycle of the living organism.
The game is played on a vast matrix whose limbs are possible sites of existence. Each site can be one of the following two situations:
1. There is life, a complete living site, marked as a full square.
2. There is no life, an empty living site. We will mark it as an empty square.
Here are the fundamental laws of the genetics of CONWAY:
Birth - in any site where there is no life of precisely three living neighbors, there will be birth in the next generation. Otherwise, the site remains lifeless, empty.
Death - in every site where there is life, with 0 or 1 living neighbors, death will occur in the next generation as a result of loneliness. In every site where there is a life of 4 or more living neighbors, there will be death in the next generation as a result of mass deportations.
Existence - any site that has a life and has 2 or 3 living neighbors, will continue to exist in the next generation.
The processes of birth, death, and existence co-occur in all sites, creating a new state of life called a new generation.
This application simulates the life game on a 10 * 10 matrix as follows:
In the first stage, the program will create a matrix with random values for initial life situations.
The program will display the matrix of life in a window with blank squares filled with life situations.
The main program will include a loop that displays a dialog box that asks the user if he wants to switch to the next generation. If so, the program will calculate the life conditions of the next generation and update the display. Otherwise, the loop will end.
