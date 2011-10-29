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

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Naveen.A.N
 * 
 */
public class Menus extends JMenuBar {
	public Menus() {

		JMenu mnFile = new JMenu("File");
		add(mnFile);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);

		JMenu mnEdit = new JMenu("Edit");
		add(mnEdit);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5368936796629484103L;

}
