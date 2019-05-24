package objects;

public interface Crudable {

	public void create(Object input);

	public String read(Object input);

	public void update(Object input, Object change);

	public void delete(Object input);

}