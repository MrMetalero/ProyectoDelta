package com.proyectodelta.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {

	private Texture flechaArriba;
	private Texture flechaAbajo;
	private Texture flechaIzquierda;
	private Texture flechaDerecha;
	private Batch conjuntoTexturas;


	@Override
	public void create () {
		batch = new SpriteBatch();
	
		flecha





	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}




}
