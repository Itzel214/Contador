package tequila.tecmm.edu.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numeroContador:TextView=findViewById(R.id.Contador)
        numeroContador.text="Contador"
        var bandera=true
        var contador=0
        val bottonAumentar :Button=findViewById(R.id.btnAumentar)
        val bottonLimpiar: Button=findViewById(R.id.btnLimpiar)

        //boton con el metodo click y su funcion es aumentar hasta que se igual a 10 y disminuir hasta que sea igual 1
        bottonAumentar.setOnClickListener {
            if (bandera==true){
                if(contador<0){
                    contador+=1
                    numeroContador.text=contador.toString()

                }else
                {
                    contador+=1
                    numeroContador.text=contador.toString()
                    bandera=false

                }
                } else
                {
                        if(contador>1)
                            contador+=1
                            numeroContador.text=contador.toString()




                    contador+=1
                    numeroContador.text =contador.toString()
                    bandera=true




                    //metodo de click para limpiar en este boton reiniciar los valores por default
                    bottonLimpiar.setOnClickListener{
                        numeroContador.text="0"
                        contador=0
                        bandera=true

                    }

                        }


                             }

                                 }

                                    }





















