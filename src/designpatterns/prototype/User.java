package designpatterns.prototype;

public class User implements Prototype {
    private Integer id;
    private String nome;

    public User() {}

    public User(User user) {
        this.id = user.id;
        this.nome = user.nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Prototype clone() {
        return new User(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
