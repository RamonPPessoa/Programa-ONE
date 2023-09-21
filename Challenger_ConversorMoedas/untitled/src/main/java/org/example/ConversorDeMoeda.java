package org.example;

import javax.swing.*;

public class ConversorDeMoeda {
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            String[] opcoes = {"Conversor de Moeda", "Outra opção 1", "Outra opção 2"};
            String opcao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
            if (opcao != null) {
                if (opcao.equals("Conversor de Moeda")) {
                    String[] moedas = {"Reais -> Dólar", "Reais -> Euro", "Reais -> Libras Esterlinas", "Reais -> Peso argentino", "Reais -> Peso Chileno", "Dólar -> Reais", "Euro -> Reais", "Libras Esterlinas -> Reais", "Peso argentino -> Reais", "Peso Chileno -> Reais"};
                    String moeda = (String) JOptionPane.showInputDialog(null, "Escolha uma moeda:", "Conversor de Moeda", JOptionPane.PLAIN_MESSAGE, null, moedas, moedas[0]);
                    if (moeda != null) {
                        double valor = 0;
                        boolean valido = false;
                        while (!valido) {
                            try {
                                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor:", "Conversor de Moeda", JOptionPane.PLAIN_MESSAGE));
                                valido = true;
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Valor inválido.", "Conversor de Moeda", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        double resultado = 0;
                        switch (moeda) {
                            case "Reais -> Dólar":
                                resultado = valor / 5.22;
                                break;
                            case "Reais -> Euro":
                                resultado = valor / 5.82;
                                break;
                            case "Reais -> Libras Esterlinas":
                                resultado = valor / 7.14;
                                break;
                            case "Reais -> Peso argentino":
                                resultado = valor / 0.053;
                                break;
                            case "Reais -> Peso Chileno":
                                resultado = valor / 0.0071;
                                break;
                            case "Dólar -> Reais":
                                resultado = valor * 5.22;
                                break;
                            case "Euro -> Reais":
                                resultado = valor * 5.82;
                                break;
                            case "Libras Esterlinas -> Reais":
                                resultado = valor * 7.14;
                                break;
                            case "Peso argentino -> Reais":
                                resultado = valor * 0.053;
                                break;
                            case "Peso Chileno -> Reais":
                                resultado = valor * 0.0071;
                                break;
                        }
                        JOptionPane.showMessageDialog(null, String.format("%.2f", valor) + (moeda.startsWith("Reais") ? " reais equivalem a " : moeda.substring(moeda.indexOf(">") + 2) + " equivalem a ") + String.format("%.2f", resultado) + ".", "Conversor de Moeda", JOptionPane.PLAIN_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, opcao + ".", opcao, JOptionPane.PLAIN_MESSAGE);
                }
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", JOptionPane.YES_NO_CANCEL_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    continuar = true;
                } else if (resposta == JOptionPane.NO_OPTION) {
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado.", "", JOptionPane.PLAIN_MESSAGE);
                } else if (resposta == JOptionPane.CANCEL_OPTION) {
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Programa concluído.", "", JOptionPane.PLAIN_MESSAGE);
                }
            } else {
                continuar = false;
            }
        }
    }
}
