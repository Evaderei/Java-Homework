/* 
	SCAFFOLD for TwoSorts

	Import Applet, swing, dependencies
	TwoSorts class extends Applet
	(ALL Applets utilize init() and paint() )
		init() 
			instantiates insertion array, seelction array (length between 10 tp 30)
			generate rand number as long as above array length
				store in both arrays
			create pass button
				add listeners
					update button to show # passes on click after sort pass
			create labels 
				"Click to sort more!"
				"Finished!"
				"Uh oh, clickto sort me!"

		paint()
	______________________________

	ALGORITHM for writing TwoSorts
	______________________________

	import dependencies
	extend Applet from TwoSorts
	Generate Insertion and selection Arrays (Length of each array is 25)
		Use random number generator
			for (i < Array.length)
				assign random number to array[i]
			
	Display rectangles for different heights for arrays on applet
	Add label for sorting start(e.g Click to sort!)
	Add button
		Add button label
	Add button listener to make pass per button click
		Button label updates after pass made
	Add label for finished sorting (e.g Finished sorting!)

	Change length of array to randome number between 10 and 30

	________

	Sources
	________
		Java Array.sort()
			http://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#sort%28int%5B%5D%29

	
*/