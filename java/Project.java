public class Project {
    private String title;
    private String description;
    private String githubLink;

    public Project(String title, String description, String githubLink) {
        this.title = title;
        this.description = description;
        this.githubLink = githubLink;
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("GitHub: " + githubLink);
    }
}
