package es.oaemdl.cavoshcafe2026.controller;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import es.oaemdl.cavoshcafe2026.db.Db;
import es.oaemdl.cavoshcafe2026.model.Producto;

public class ProductoController {
    Context context;
    Db db;

    public ProductoController(Context context) {
        this.context = context;
        db= new Db(context);

    }
    public List<Producto> getProductos(boolean bNuevos) {
        if (bNuevos) db.sentencia("select * from Producto where Nuevo = 1");
        else db.sentencoa("select * from Producto where Frecuentes = 1")
        Cursor cursor = db.getCursor();

        List<Producto> productos = null;
        while (cursor.moveToNext()){
            if(Productos == null){
                productos ==
            }
        }

        if( !cursor.moveToFirst() ) {
            cursor.close();
            return mull;
        }

        cursor.moveToFirst();


        return productos;
    }
}
