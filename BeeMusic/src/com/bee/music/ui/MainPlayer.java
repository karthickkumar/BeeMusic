/**   
 * License Agreement for BeeMusic
 *
 * Copyright (C) 2010 Naveen.A.N
 *
 * BeeMusic is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BeeMusic is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with OpenSearchServer. 
 *  If not, see <http://www.gnu.org/licenses/>.
 **/
package com.bee.music.ui;

import javax.swing.JFrame;

/**
 * @author Naveen.A.N
 * 
 */
public class MainPlayer {

	public JFrame playerGui;

	/**
	 * Create the application.
	 */
	public MainPlayer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		playerGui = new JFrame();
		playerGui.setBounds(100, 100, 450, 300);
		playerGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Menus menus = new Menus();
		playerGui.setJMenuBar(menus);
	}

}
