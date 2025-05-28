/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.controller;

import br.com.fatec.model.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Persistencia {
    
    public static String caminho = "C:\\Users\\nickl\\OneDrive\\Área de Trabalho\\users.txt";

    public static ArrayList<Usuario> lista = new ArrayList<>();

    public static boolean cadastrar(Usuario u) {
        for (Usuario usuario : lista) {
            if (usuario.getLogin().equalsIgnoreCase(u.getLogin())) {
                return false; // login já existe
            }
        }
        lista.add(u);
        return true;
    }

    public static void exportar(ArrayList<String> dados, String caminho) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminho));
        for (String linha : dados) {
            writer.write(linha);
            writer.newLine();
        }
        writer.close();
    }

    public static ArrayList<Usuario> usuarios(String caminho) {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(caminho));
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split("-");
                if (partes.length == 3) {
                    String nome = partes[0];
                    String login = partes[1];
                    String senha = partes[2];
                    Usuario u = new Usuario(nome, login, senha);
                    listaUsuarios.add(u);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        lista = listaUsuarios;
        return listaUsuarios;
    }

    public static void salvarUsuarios(String caminho) {
        ArrayList<String> dadosParaSalvar = new ArrayList<>();
        for (Usuario u : lista) {
            dadosParaSalvar.add(u.getNome() + "-" + u.getLogin() + "-" + u.getSenha());
        }
        try {
            exportar(dadosParaSalvar, caminho);
        } catch (IOException e) {
            System.out.println("Erro ao salvar usuários: " + e.getMessage());
        }
    }
}
