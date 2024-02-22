import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class PaintBrush{

	public static void main(String[] args) {
		Frame a = new Frame();

	}

}

class Frame extends JFrame implements ActionListener{
	ArrayList<int[]> shapes = new ArrayList<>();
	int[] found = new int[7];
	String grabbedshape = "";
	Color purple = new Color(120, 0, 153);
	int x1 = 0;
	int y1 = 0;
	int width = 0;
	int height = 0;
	int index_line = 0;
	int yclicked=0;
	int xclicked=0;
	int lastx=0;
	int lasty=0;
	TusPaneli tus_paneli = new TusPaneli();
	CizimPneli cizim_paneli= new CizimPneli();
	Boolean grabbed = false;
	JButton dikdortgenciz = new JButton("Dikdortgen Çiz");
	JButton ovalciz = new JButton("Oval Çiz");
	JButton kalemciz = new JButton("Kalemle Çiz");
	JButton tasi = new JButton("Taşı");
	String islem = "";
	Color color = Color.black;
	Boolean clicked = false;
	Boolean dragged = false;
	Boolean exited = false;
	Boolean cizim_alaninda = false;
	Boolean released = true;
	int x = 0;
	int y = 0;
	int oldx = 0;
	int oldy = 0;

	private class TusPaneli extends JPanel implements MouseInputListener {
		public TusPaneli() {
			super();
			addMouseListener(this);

		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawRect((getWidth() - 420) / 2, 10, 60, 25);
			g.drawRect((getWidth() - 420) / 2 + 60, 10, 60, 25);
			g.drawRect((getWidth() - 420) / 2 + 120, 10, 60, 25);
			g.drawRect((getWidth() - 420) / 2 + 180, 10, 60, 25);
			g.drawRect((getWidth() - 420) / 2 + 240, 10, 60, 25);
			g.drawRect((getWidth() - 420) / 2 + 300, 10, 60, 25);
			g.drawRect((getWidth() - 420) / 2 + 360, 10, 60, 25);
			g.setColor(Color.blue);
			g.fillRect((getWidth() - 420) / 2, 10, 60, 25);
			g.setColor(Color.red);
			g.fillRect((getWidth() - 420) / 2 + 60, 10, 60, 25);
			g.setColor(Color.green);
			g.fillRect((getWidth() - 420) / 2 + 120, 10, 60, 25);
			g.setColor(Color.yellow);
			g.fillRect((getWidth() - 420) / 2 + 180, 10, 60, 25);
			g.setColor(Color.orange);
			g.fillRect((getWidth() - 420) / 2 + 240, 10, 60, 25);
			g.setColor(purple);
			g.fillRect((getWidth() - 420) / 2 + 300, 10, 60, 25);
			g.setColor(Color.black);
			g.fillRect((getWidth() - 420) / 2 + 360, 10, 60, 25);
			g.setColor(color);


		}

		@Override
		public void mouseClicked(MouseEvent e) {
//			System.out.println(e.getX()+"--------"+e.getY());
			if (e.getY() >= 10 && e.getY() <= 35) {
			if (e.getX() >= (getWidth() - 420) / 2 && (e.getX() <= (getWidth() - 420) / 2 + 60)) {
//				System.out.println("blue");
				color= Color.blue;
				return;
			} else if (e.getX() >= (getWidth() - 420) / 2 + 60 && (e.getX() <= (getWidth() - 420) / 2 + 120)) {
				color = Color.red;
				return;
			} else if (e.getX() >= (getWidth() - 420) / 2 + 120 && (e.getX() <= (getWidth() - 420) / 2 + 180)) {
				color = Color.green;
				return;
			} else if (e.getX() >= (getWidth() - 420) / 2 + 180 && (e.getX() <= (getWidth() - 420) / 2 + 240)) {
				color = Color.yellow;
				return;
			} else if (e.getX() >= (getWidth() - 420) / 2 + 240 && (e.getX() <= (getWidth() - 420) / 2 + 300)) {
				color = Color.orange;
				return;
			} else if (e.getX() >= (getWidth() - 420) / 2 + 300 && (e.getX() <= (getWidth() - 420) / 2 + 360)) {
				color = purple;
				return;
			} else if (e.getX() >= (getWidth() - 420) / 2 + 360 && (e.getX() <= (getWidth() - 420) / 2 + 420)) {
				color = Color.black;
				return;
			}
		}
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
			if (e.getY() >= 10 && e.getY() <= 35) {
			if (e.getX() >= (getWidth() - 420) / 2 && (e.getX() <= (getWidth() - 420) / 2 + 60)) {
//				System.out.println("blue");
				color= Color.blue;
				return;
			} else if (e.getX() >= (getWidth() - 420) / 2 + 60 && (e.getX() <= (getWidth() - 420) / 2 + 120)) {
				color = Color.red;
//				System.out.println("red");
				return;
			} else if (e.getX() >= (getWidth() - 420) / 2 + 120 && (e.getX() <= (getWidth() - 420) / 2 + 180)) {
				color = Color.green;
//				System.out.println("green");
				return;
			} else if (e.getX() >= (getWidth() - 420) / 2 + 180 && (e.getX() <= (getWidth() - 420) / 2 + 240)) {
				color = Color.yellow;
//				System.out.println("yellow");
				return;
			} else if (e.getX() >= (getWidth() - 420) / 2 + 240 && (e.getX() <= (getWidth() - 420) / 2 + 300)) {
				color = Color.orange;
//				System.out.println("orange");
				return;
			} else if (e.getX() >= (getWidth() - 420) / 2 + 300 && (e.getX() <= (getWidth() - 420) / 2 + 360)) {
//				System.out.println("purple");
				color = purple;
				return;
			} else if (e.getX() >= (getWidth() - 420) / 2 + 360 && (e.getX() <= (getWidth() - 420) / 2 + 420)) {
				color = Color.black;
//				System.out.println("black");
				return;
			}
		}
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
	private class CizimPneli extends JPanel implements MouseInputListener {
		public CizimPneli() {
			super();
			addMouseListener(this);
			addMouseMotionListener(this);

		}
		public void draw_all(Graphics g) {

			for (int i=0;i<shapes.size();i++) {
				int[] keys=shapes.get(i);
				g.setColor(new Color(keys[4], keys[5], keys[6]));

				if (keys[7]==2) {
					g.fillRect(keys[0], keys[1], keys[2], keys[3]);
				} else if (keys[7]==3) {
					g.fillOval(keys[0], keys[1], keys[2], keys[3]);
				} else if (keys[7]==1) {
					g.drawLine(keys[0], keys[1], keys[2], keys[3]);
				//	g.fillRect(keys[0], keys[1], 5, 5);
				}
				if (grabbed && grabbedshape.equals("dikdortgen")) {
					g.setColor(new Color(found[4], found[5], found[6]));
					g.fillRect(found[0], found[1], found[2], found[3]);
				} else if (grabbed &&grabbedshape.equals("oval")) {
					g.setColor(new Color(found[4], found[5], found[6]));
					g.fillOval(found[0], found[1], found[2], found[3]);
				}

			}
			g.setColor(color);
		}

		public void paintComponent(Graphics g) {
	//		System.out.println("prints");
			super.paintComponent(g);
			g.setColor(color);
			if (islem.equals("dikdortgen")) {
				
				if (!released) {
					g.fillRect(x1, y1, width, height);
					repaint();
					draw_all(g);
					g.fillRect(x1, y1, width, height);
				} else if(y>=0){
//					g.fillRect(x1, y1, width, height);
					int[] par=new int[8];
//					g.setColor(color);
					par[0]=x1;
					par[1]=y1;
					par[2]=width;
					par[3]=height;
					par[4]=color.getRed();
					par[5]=color.getGreen();
					par[6]=color.getBlue();
					par[7]=2;
					shapes.add(par);
					draw_all(g);
					index_line+=7;
					g.fillRect(x1, y1, width, height);
					
				}else
					draw_all(g);

			} else if (islem.equals("oval")) {

				if (!released ) {
					g.fillOval(x1, y1, width, height);
					repaint();
					draw_all(g);
					g.fillOval(x1, y1, width, height);

				} else if(y>=0){

					g.fillOval(x1, y1, width, height);
					int[] par=new int[8];
					par[0]=x1;
					par[1]=y1;
					par[2]=width;
					par[3]=height;
					par[4]=color.getRed();
					par[5]=color.getGreen();
					par[6]=color.getBlue();
					par[7]=3;
					shapes.add(par);
					draw_all(g);
					g.fillOval(x1, y1, width, height);
				}else 
					draw_all(g);
			} else if (islem.equals("kalem") ) {

				draw_all(g);

			}else if(islem.equals("tasi")) {
				if(grabbed) {
				found[0]=x-xclicked;
				found[1]=y-yclicked;
				if(y<=yclicked) {
					found[1]=0;
				}
				repaint();
				//draw_all(g);
				}
				draw_all(g);
			}
			


		}


		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
			x=e.getX();
			y=e.getY();
			clicked = true;
			released = false;
			lastx=e.getX();
			lasty=e.getY();
//			System.out.println("x: "+e.getX()+"y: "+e.getY());
			oldx = e.getX();
			oldy = e.getY();
			if (islem.equals("tasi")) {
				
				int[] removed=new int[7];
				for (int[] keys: shapes) {
					if (keys[7]!=1) {

						if (keys[7]==2) {
							if (x >= keys[0] && x <= (keys[0] + keys[2]) && y >= keys[1] && y <= (keys[1] + keys[3])) {
								grabbed = true;
								found = keys;
								grabbedshape = "dikdortgen";
								xclicked=x-keys[0];
								yclicked=y-keys[1];
								removed=keys;
							}

						} else if (keys[7]==3) {
							double centerx = (keys[0] + keys[2] / 2);
							double centery = (keys[1] + keys[3] / 2);
							double rx = keys[2] / 2;
							double ry = keys[3] / 2;
							if (((x - centerx) * (x - centerx) / (rx * rx)
									+ (y - centery) * (y - centery) / (ry * ry)) <= 1) {
								grabbed = true;
								found = keys;
								grabbedshape = "oval";
								removed=keys;
								xclicked=x-keys[0];
								yclicked=y-keys[1];
								
								

							}

						}

					}
				}
				if(grabbed) {
					shapes.remove(removed);
					shapes.add(removed);
				}

			}

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			clicked = false;
			dragged = false;
			released = true;
			grabbed = false;

			
			

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			exited = false;

		}

		@Override
		public void mouseExited(MouseEvent e) {
//			System.out.println("exited");
			clicked = false;
			exited = true;

		}

		@Override
		public void mouseDragged(MouseEvent e) {
//			System.out.println("Im trying");
			x = e.getX();
			y = e.getY();
			dragged = true;
			clicked = true;

			if (x > oldx && y > oldy) {
				x1 = oldx;
				y1 = oldy;
				width = x - oldx;
				height = y - oldy;

			} else if (x > oldx && y < oldy) {
				x1 = oldx;
				y1 = y;
				width = x - oldx;
				height = oldy - y;

			} else if (x < oldx && y > oldy) {
				x1 = x;
				y1 = oldy;
				width = oldx - x;
				height = y - oldy;

			} else if (x < oldx && y < oldy) {
				x1 = x;
				y1 = y;
				width = oldx - x;
				height = oldy - y;

			}
			if (islem.equals("kalem")&&!released ) {
				getGraphics().drawLine(lastx, lasty, x, y);
//				getGraphics().drawRect(lastx, lasty, , height);
				int[] par=new int[8];
				par[0]=lastx;
				par[1]=lasty;
				par[2]=x;
				par[3]=y;
				par[4]=color.getRed();
				par[5]=color.getGreen();
				par[6]=color.getBlue();
				par[7]=1;
				shapes.add(par);
				index_line+=7;
			}
			lastx=x;
			lasty=y;
			if(y>0)
				repaint();
			
			

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			x = e.getX();
			y = e.getY();
//			System.out.println(x+"///////////////////////"+y);
			

		}

	}

	public Frame() {
		this.setSize(700, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.setBackground(Color.white);

		tus_paneli.setPreferredSize(new Dimension(this.getWidth(), 80));
		tus_paneli.setLayout(new FlowLayout(1, 2, 40));
		cizim_paneli.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()-110));
		cizim_paneli.setLayout(new FlowLayout());
		tus_paneli.add(dikdortgenciz);
		tus_paneli.add(ovalciz);
		tus_paneli.add(kalemciz);
		tus_paneli.add(tasi);
		tus_paneli.setBackground(Color.white);
		cizim_paneli.setBackground(Color.white);
		

		this.add(tus_paneli, BorderLayout.NORTH);
		this.add(cizim_paneli,BorderLayout.CENTER);

		dikdortgenciz.addActionListener(this);
		ovalciz.addActionListener(this);
		kalemciz.addActionListener(this);
		tasi.addActionListener(this);
		this.addComponentListener(new ComponentListener() {
			
			@Override
			public void componentShown(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void componentResized(ComponentEvent e) {
				cizim_paneli.setPreferredSize(new Dimension(getWidth(), getHeight()-110));
				
			}
			
			@Override
			public void componentMoved(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void componentHidden(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		dikdortgenciz.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				islem = "dikdortgen";
//				System.out.println("dikdortgen");

			}
		});
		ovalciz.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				islem = "oval";

			}
		});
		kalemciz.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				islem = "kalem";

			}
		});
		tasi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				islem = "tasi";

			}
		});
//		tus_paneli.setBorder(new LineBorder(Color.RED));
//		cizim_paneli.setBorder(new LineBorder(Color.green));
		

	}



	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.cyan);
		g.fillRect(0, 105, this.getWidth(), 5);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}








}
