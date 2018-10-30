/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diogoleite.controller;

import br.com.diogoleite.application.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DialogEvent;
import javafx.scene.control.TextField;

/**
 *
 * @author diogo_leite
 */
public class FXMLCalculadoraController implements Initializable {

    private double valor1;
    private double valor2;
    private String operacao = "";
    private double resultado;
    private boolean chaveParaLimpar;
    @FXML
    private TextField txtValor;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnDesligar;

    @FXML
    private Button btnSete;

    @FXML
    private Button btnOito;

    @FXML
    private Button btnNove;

    @FXML
    private Button btnQuatro;

    @FXML
    private Button btnCinco;

    @FXML
    private Button btnSeis;

    @FXML
    private Button btnUm;

    @FXML
    private Button btnDois;

    @FXML
    private Button btnTres;

    @FXML
    private Button btnZero;

    @FXML
    private Button btnZeroDuplo;

    @FXML
    private Button btnPonto;

    @FXML
    private Button btnDivisao;

    @FXML
    private Button btnSubtracao;

    @FXML
    private Button btnMultiplicacao;

    @FXML
    private Button btnSoma;

    @FXML
    private Button btnIgual;

    @FXML
    private Button btnDel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnLimpar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                limpar(true);

            }
        });

        btnZero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                limpar(chaveParaLimpar);
                digitarValor("0");
            }
        });

        btnZeroDuplo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                limpar(chaveParaLimpar);
                digitarValor("00");
            }
        });

        btnUm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                limpar(chaveParaLimpar);
                digitarValor("1");
            }
        });

        btnDois.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                limpar(chaveParaLimpar);
                digitarValor("2");
            }
        });
        btnTres.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                limpar(chaveParaLimpar);
                digitarValor("3");
            }
        });

        btnQuatro.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                limpar(chaveParaLimpar);
                digitarValor("4");
            }
        });

        btnCinco.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                limpar(chaveParaLimpar);
                digitarValor("5");
            }
        });

        btnSeis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                limpar(chaveParaLimpar);
                digitarValor("6");
            }
        });
        btnSete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                limpar(chaveParaLimpar);
                digitarValor("7");
            }
        });

        btnOito.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                limpar(chaveParaLimpar);
                digitarValor("8");
            }
        });

        btnNove.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                limpar(chaveParaLimpar);
                digitarValor("9");
            }
        });

        btnPonto.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!txtValor.getText().contains(".")) {
                    digitarValor(".");
                }
            }
        });

        btnDesligar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setWidth(400);
                alert.setHeight(400);
                alert.setTitle("Sobre");
                alert.setContentText("GITHUB: @diogojustino");
                alert.setHeaderText("Desenvolvido por Diogo Leite Da Silva Justino.");
                alert.setOnCloseRequest(new EventHandler<DialogEvent>() {
                    @Override
                    public void handle(DialogEvent event) {
                        Main.getStage().close();
                    }
                });
                alert.show();

            }
        });

        btnSoma.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (operacao.isEmpty()) {
                    operacao = "+";
                    valor1 = Double.parseDouble(txtValor.getText());
                    txtValor.setText("0");
                }
            }
        });

        btnSubtracao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (operacao.isEmpty()) {
                    operacao = "-";
                    valor1 = Double.parseDouble(txtValor.getText());
                    txtValor.setText("0");
                }
            }
        });

        btnMultiplicacao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (operacao.isEmpty()) {
                    operacao = "*";
                    valor1 = Double.parseDouble(txtValor.getText());
                    txtValor.setText("0");
                }
            }
        });

        btnDivisao.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (operacao.isEmpty()) {
                    operacao = "/";
                    valor1 = Double.parseDouble(txtValor.getText());
                    txtValor.setText("0");
                }
            }
        });

        btnIgual.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor2 = Double.parseDouble(txtValor.getText());
                switch (operacao) {
                    case "+":
                        resultado = valor1 + valor2;
                        txtValor.setText(String.valueOf(resultado));
                        break;
                    case "-":
                        resultado = valor1 - valor2;
                        txtValor.setText(String.valueOf(resultado));
                        break;
                    case "*":
                        resultado = valor1 * valor2;
                        txtValor.setText(String.valueOf(resultado));
                        break;
                    case "/":
                        if (valor2 != 0) {
                            resultado = valor1 / valor2;
                            txtValor.setText(String.valueOf(resultado));
                        } else {
                            alerta(AlertType.ERROR, "Indefinido!");
                        }
                        break;

                }
                chaveParaLimpar = true;
                
            }

        });

        btnDel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String valor = txtValor.getText();
                if (!valor.isEmpty()) {
                    valor = valor.substring(0, valor.length() - 1);
                }
                if (valor.isEmpty()) {
                    valor = "0";
                }

                txtValor.setText(valor);
            }
        });
    }

    private void digitarValor(String valor) {
        String valorTela = txtValor.getText();
        if (valorTela.equals("0")) {
            txtValor.setText(valor);
        } else {
            txtValor.setText(txtValor.getText() + valor);
        }
    }

    private void alerta(AlertType alertType, String mensagem) {
        Alert alert = new Alert(alertType);
        alert.setHeight(400);
        alert.setWidth(400);
        alert.setHeaderText(mensagem);
        alert.show();
    }

    private void limpar(boolean podeSerLimpado) {
        if (podeSerLimpado) {
            txtValor.setText("0");
            valor1 = 0;
            valor2 = 0;
            resultado = 0;
            operacao = "";
            chaveParaLimpar = false;
        }
    }
    
}
