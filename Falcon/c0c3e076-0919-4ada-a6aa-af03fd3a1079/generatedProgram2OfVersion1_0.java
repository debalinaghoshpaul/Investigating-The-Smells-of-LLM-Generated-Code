// Corner case: Empty array
int[][] intervals1 = {};

// Corner case: Array with one interval
int[][] intervals2 = {{1, 3}};

// Corner case: Array with overlapping intervals at the start
int[][] intervals3 = {{1, 3}, {2, 4}};

// Corner case: Array with overlapping intervals at the end
int[][] intervals4 = {{1, 3}, {2, 4}, {5, 7}};

// Corner case: Array with non-overlapping intervals
int[][] intervals5 = {{1, 3}, {5, 7}, {9, 11}};
