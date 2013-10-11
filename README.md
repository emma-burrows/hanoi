Hanoi
=====

Towers of Hanoi was one of the Basic programs I painstakingly typed into my TI-99/4A as a child. It came to mind when I was thinking about a project to try out Test Driven Development "properly", ie on a greenfield project, rather than applying the technique retrospectively to an existing project.

For anyone who hasn't come across the game before, here is the simple description copied from <a href="http://en.wikipedia.org/wiki/Tower_of_Hanoi">Wikipedia</a>:

It consists of three rods, and a number of disks of different sizes which can slide onto any rod. The puzzle starts with the disks in a neat stack in ascending order of size on one rod, the smallest at the top, thus making a conical shape.
The objective of the puzzle is to move the entire stack to another rod, obeying the following rules:
* Only one disk must be moved at a time.
* Each move consists of taking the upper disk from one of the rods and sliding it onto another rod, on top of the other disks that may already be present on that rod.
* No disk may be placed on top of a smaller disk.

The application itself will consist of a set of classes with a simple API to initialise the three rods with a user-configured number of disks, and move the disks between rods without breaking the rules above.
