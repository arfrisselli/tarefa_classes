/**
 * 
 */
package tarefa_classes;

/**
 * Classe Garrafa
 * 
 * @author andrey.frisselli
 *
 * @version 1.0
 * 
 */
public class Garrafa
{
	private String material;

	private String capacidade;

	private String conteudo;

	/**
	 * Busca o material do qual a garrafa é feita
	 * 
	 * @return Retorna o material do qual a garrafa é feita
	 */
	public String getMaterial()
	{
		return material;
	}

	/**
	 * Define o material da garrafa
	 * 
	 * @param material
	 */
	public void setMaterial(String material)
	{
		this.material = material;
	}

	/**
	 * Busca a capacidade de armazenamento da garrafa
	 * 
	 * @return Retorna a capacidade de armazenamento da garrafa
	 */
	public String getCapacidade()
	{
		return capacidade;
	}

	/**
	 * Define a capacidade da garrafa
	 * 
	 * @param capacidade
	 */
	public void setCapacidade(String capacidade)
	{
		this.capacidade = capacidade;
	}

	/**
	 * Busca o conteúdo da garrafa
	 * 
	 * @return Retorna o conteúdo que está dentro da garrafa
	 */
	public String getConteudo()
	{
		return conteudo;
	}

	/**
	 * Define o conteúdo da garrafa
	 * 
	 * @param conteudo
	 */
	public void setConteudo(String conteudo)
	{
		this.conteudo = conteudo;
	}

}
