package es.oaemdl.cavoshcafe2026.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import es.oaemdl.cavoshcafe2026.controller.ProductoController;
import es.oaemdl.cavoshcafe2026.databinding.FragmentInicioBinding;
import es.oaemdl.cavoshcafe2026.model.Producto;

public class Inicio extends Fragment {
    FragmentInicioBinding binding;
    Context context;
    NavController navController;
    View view;
    ProductoController controller;
    List<Producto> productos;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentInicioBinding.inflate(inflater, container, false );
        return view = binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        context = getContext();
        navController = Navigation.findNavController( view );
        controller = new ProductoController(context);
        productosNuevos = controller.getProductos("true");
        productosFrecuentes = controller.getProductos("false");

    }

}