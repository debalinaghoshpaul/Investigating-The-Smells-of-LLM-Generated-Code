    private String authorName;
    private String paperTitle;
    private Date dateOfSubmission;
    
    public Journal(String authorName, String paperTitle, Date dateOfSubmission) {
        this.authorName = authorName;
        this.paperTitle = paperTitle;
        this.dateOfSubmission = dateOfSubmission;
    }
    
    public void displayDetails() {
        System.out.println("Author: " + authorName);
        System.out.println("Paper Title: " + paperTitle);
        System.out.println("Date of Submission: " + dateOfSubmission);
    }
    
    public String getSubmissionDetails() {
        String[] words = paperTitle.split(" ");
        StringBuilder formattedTitle = new StringBuilder();
        
        for(String word : words) {
            formattedTitle.append(word.substring(0,1).toUpperCase())
                         .append(word.substring(1).toLowerCase())
                         .append(" ");
        }
        
        return formattedTitle.toString().trim();
    }
}
