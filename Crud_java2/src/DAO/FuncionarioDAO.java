package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();

    public void cadastrarfuncionario(FuncionarioDTO objfuncionariodto) {
        String sql = "insert into funcionario (nome_fucionario, profissao ) values (?,?) ";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getProfissao_funcionario());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO cadastrar" + erro);

        }

    }

    public ArrayList<FuncionarioDTO> PesquisarFuncionario() {

        String sql = "select * from funcionario";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) { // enquanto tiver linha vai repetir
                FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
                objFuncionarioDTO.setId_funcionario(rs.getInt("id"));
                objFuncionarioDTO.setNome_funcionario(rs.getString("nome_fucionario"));
                objFuncionarioDTO.setProfissao_funcionario(rs.getString("profissao"));

                lista.add(objFuncionarioDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "funcionarioDAO pesquisar" + erro);
        }
        return lista;
    }

    //estrutura para o Alterar
    public void alterarFuncionario(FuncionarioDTO objfuncionariodto) {
        String sql = "update funcionario set nome_fucionario = ? , profissao = ? where id = ? ";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql); //chamo a conexão com o banco atravez do metodo ja criado

            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getProfissao_funcionario());
            pstm.setInt(3, objfuncionariodto.getId_funcionario());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Alterar" + erro);

        }

    }

    //metodo para excluir
    public void excluirFuncionario(FuncionarioDTO objfuncionariodto){
        String sql = "delete from funcionario where id =?";
        
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql); //chamo a conexão com o banco atravez do metodo ja criado

            
            pstm.setInt(1, objfuncionariodto.getId_funcionario());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Excluir" + erro);

        }
        
    }
    
    
    
}
