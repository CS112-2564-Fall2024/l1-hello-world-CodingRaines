public class Whiteboard {
    // value
    String instructions;

    // Consturctor, default
    public Whiteboard() {
        this.instructions = "None";
    }

    // Constructor, full
    public Whiteboard(String instructions) {
        this.instructions = instructions;

        // Secretly return this
    }

    // getters
    public String getInstructions() {
        return instructions;
    }

    // setters
    public void setInstructions(String newInstructions) {
        this.instructions = newInstructions;
    }

    // toString
    public String toString() {
        return instructions;
    }

    // equals
    public boolean equals(Whiteboard otherWhiteboard) {
        // = assigns a value
        // == compares object references

        if (this.instructions.equals(otherWhiteboard.instructions))
            return true;
        else
            return false;
    }
}
