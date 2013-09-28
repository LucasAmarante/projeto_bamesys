package bamesys_lucas

class PessoaFisica {

	int id
	
	PessoaJuridica pessoajuridica
	
	static mapping={
		table 'tb_pessoafisica'
		version false
		id column: 'id_pf',generator: 'increment', sqlType: 'tinyint'
		
		
		
	}
	
    static constraints = {
    }
}
