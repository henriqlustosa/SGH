package br.com.hspm.sgh.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import br.com.hspm.sgh.model.Paciente;
import br.com.hspm.sgh.persistence.Conexao;

public class PacienteDto {

	public static Paciente paciente(Long _prontuario) {
		Paciente paciente = new Paciente();
		PreparedStatement preparedStatement;
		try {
			
			String sqlString = "SELECT * FROM agh.v_paciente WHERE cd_prontuario = " + _prontuario;
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				paciente.setCd_prontuario(resultSet.getLong("cd_prontuario"));
				paciente.setNm_situacao(resultSet.getString("nm_situacao"));
				paciente.setNm_nome(resultSet.getString("nm_nome"));
				paciente.setNm_nome_social(resultSet.getString("nm_nome_social"));
				paciente.setNm_vinculo(resultSet.getString("nm_vinculo"));
				paciente.setNm_orgao(resultSet.getString("nm_orgao"));
				paciente.setCd_rf_matricula(resultSet.getLong("cd_rf_matricula"));
				paciente.setIn_sexo(resultSet.getString("in_sexo"));
				paciente.setDc_cor(resultSet.getString("dc_cor"));
				paciente.setDc_estado_civil(resultSet.getString("dc_estado_civil"));
				paciente.setCd_mae(resultSet.getInt("cd_mae"));
				paciente.setNm_mae(resultSet.getString("nm_mae"));
				paciente.setNm_pai(resultSet.getString("nm_pai"));
				
				String dt_nascimetno = dateFormat.format(resultSet.getTimestamp("dt_data_nascimento"));
				paciente.setDt_data_nascimento(dt_nascimetno);
				paciente.setNr_idade(resultSet.getLong("nr_idade"));
				paciente.setNm_nacionalidade(resultSet.getString("nm_nacionalidade"));
				paciente.setNm_naturalidade(resultSet.getString("nm_naturalidade"));
				paciente.setSg_uf(resultSet.getString("sg_uf"));
				paciente.setDc_grau_instrucao(resultSet.getString("dc_grau_instrucao"));
				paciente.setDc_ocupacao(resultSet.getString("dc_ocupacao"));
				paciente.setNr_ddd_fone(resultSet.getInt("nr_ddd_fone"));
				paciente.setNr_fone(resultSet.getLong("nr_fone"));
				paciente.setNr_ddd_fone_recado(resultSet.getInt("nr_ddd_fone_recado"));
				paciente.setNr_fone_recado(resultSet.getLong("nr_fone_recado"));
				paciente.setCd_cep(resultSet.getLong("cd_cep"));
				paciente.setDc_logradouro(resultSet.getString("dc_logradouro"));
				paciente.setNr_logradouro(resultSet.getInt("nr_logradouro"));
				paciente.setDc_complemento_logradoutro(resultSet.getString("dc_complemento_logradouro"));
				paciente.setDc_bairro(resultSet.getString("dc_bairro"));
				paciente.setCd_ibge_cidade(resultSet.getString("cd_ibge_cidade"));
				paciente.setSg_uf_endereco(resultSet.getString("sg_uf_endereco"));
				paciente.setTp_endereco(resultSet.getString("tp_endereco"));
				paciente.setIn_correspondencia(resultSet.getString("in_correspondencia"));
				paciente.setNr_rg(resultSet.getString("nr_rg"));
				paciente.setDc_orgao_emissor(resultSet.getString("dc_orgao_emissor"));
				paciente.setSg_uf_sigla_emitiu_docto(resultSet.getString("sg_uf_sigla_emitiu_docto"));
				paciente.setDt_emissao_documento(resultSet.getString("dt_emissao_documento"));
				paciente.setNr_cpf(resultSet.getLong("nr_cpf"));
				paciente.setNr_pis(resultSet.getLong("nr_pis"));
				paciente.setIn_documentos_apresentados(resultSet.getString("in_documentos_apresentados"));
				paciente.setNm_certidao(resultSet.getString("nm_certidao"));
				paciente.setNm_cartorio(resultSet.getString("nm_cartorio"));
				paciente.setNr_livro(resultSet.getString("nr_livro"));
				paciente.setNr_folhas(resultSet.getInt("nr_folhas"));
				paciente.setNr_termo(resultSet.getInt("nr_termo"));
				paciente.setDt_emissao(resultSet.getString("dt_emissao"));
				paciente.setNr_declaracao_nascido(resultSet.getLong("nr_declaracao_nascido"));
				paciente.setNr_cartao_saude(resultSet.getLong("nr_cartao_saude"));
				paciente.setNm_motivo_cadastro(resultSet.getString("nm_motivo_cadastro"));
				paciente.setDc_documento_referencia(resultSet.getString("dc_documento_referencia"));
				paciente.setNr_cartao_nacional_saude_mae(resultSet.getLong("nr_cartao_nacional_saude_mae"));
				paciente.setDt_entrada_br(resultSet.getString("dt_entrada_br"));
				paciente.setDt_naturalizacao(resultSet.getString("dt_naturalizacao"));
				paciente.setNr_portaria(resultSet.getLong("nr_portaria"));
				paciente.setDc_observacao(resultSet.getString("dc_observacao"));
				
				//DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
				//String dt_consulta = dateFormat.format(resultSet.getTimestamp("dt_consulta"));
				//paciente.setDt_consulta(dt_consulta);				
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return paciente;
	}
}
