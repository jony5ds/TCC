package br.com.alura.leilao.ui.recyclerview.adapter;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.alura.leilao.model.Leilao;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class ListaLeilaoAdapterTest {

    @Mock
    private Context context;
    @Spy
    private ListaLeilaoAdapter adapter = new ListaLeilaoAdapter(context);

    @Test
    public void deve_retornarQuantidadeDeItens_quandoAtualizarLista() {
        doNothing().when(adapter).atualizaLista();
        adapter.atualiza(new ArrayList<>(Arrays.asList(
                new Leilao("Console"),
                new Leilao("Computador")
        )));
        verify(adapter).atualizaLista();
        assertEquals(2, adapter.getItemCount());
    }

}