public class Task {
    private String description; // Descrição da tarefa
    private boolean done; // Indica se a tarefa está concluída
    private boolean doing; // Indica se a tarefa está em progresso

    // Construtor da classe
    public Task(String description) {
        this.description = description;
        this.done = false; // Inicialmente, a tarefa não está concluída
    }

    // Métodos para acessar a descrição da tarefa
    public String getDescription() {
        return description;
    }

    // Métodos para verificar se a tarefa está concluída ou em andamento
    public boolean isDone() {
        return done;
    }

    public boolean isDoing() {
        return doing;
    }

    // Métodos para definir o status da tarefa
    public void setDone(boolean done) {
        this.done = done;
    }

    public void setDoing(boolean doing) {
        this.doing = doing;
    }

    // Sobrescreve o método toString para exibir apenas a descrição da tarefa na lista
    @Override
    public String toString() {
        return description;
    }
}
