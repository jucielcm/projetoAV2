package com.example.demo.enums;

public enum TipoSexo {
	
	MACHO(1, "Macho"),
	FÊMEA(2, "Fêmea");

	private int codigo;
	private String descrição;

	private TipoSexo(int codigo, String descrição) {
		this.codigo = codigo;
		this.descrição = descrição;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescrição() {
		return descrição;
	}

	public static TipoSexo toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}

		for (TipoSexo tipoSexo : TipoSexo.values()) {
			if (codigo.equals(tipoSexo.getCodigo())) {
				return tipoSexo;
			}
		}
		throw new IllegalArgumentException("Código para tipo de sexo inválido. Código: " + codigo);
	}

}
