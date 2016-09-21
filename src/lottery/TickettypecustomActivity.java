package lottery;

import java.io.WriteAbortedException;

import com.example.lottery.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class TickettypecustomActivity extends Activity {
	private ImageButton btn_ticket_change1, btn_ticket_change2, btn_ticket_change3;
	private ImageButton btn_ticket_change4, btn_ticket_change5, btn_ticket_change6;
	private ImageButton btn_ticket_change_delelte1, btn_ticket_change_delelte2, btn_ticket_change_delelte3;
	private ImageButton btn_ticket_change_delelte4, btn_ticket_change_delelte5, btn_ticket_change_delelte6;
	private ImageButton btn_ticket_container1, btn_ticket_container2, btn_ticket_container3;
	private ImageButton btn_ticket_container4, btn_ticket_container5, btn_ticket_container6;
	private ImageButton btn_ticket_container_add1, btn_ticket_container_add2, btn_ticket_container_add3;
	private ImageButton btn_ticket_container_add4, btn_ticket_container_add5, btn_ticket_container_add6;
	private int distinguish1 = 0, distinguish2 = 0, distinguish3 = 0;
	private int distinguish4 = 0, distinguish5 = 0, distinguish6 = 0;
	private int container_distinguish1 = 0, container_distinguish2 = 0, container_distinguish3 = 0;
	private int container_distinguish4 = 0, container_distinguish5 = 0, container_distinguish6 = 0;
	private SharedPreferences pre;
	private TextView changetype_ok;
	private int a, b, c, d, e, f, g, h, i, j, k, l;
	private TextView changetype_cancel;

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			write(a, b, c, d, e, f, g, h, i, j, k, l);
			finish();
		}
		return false;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tickettypecustom);
		initialize();// ��ʼ������
		setimagechange();
		readcontainer();
		setcontainerimage();

		a = distinguish1;
		b = distinguish2;
		c = distinguish3;
		d = distinguish4;
		e = distinguish5;
		f = distinguish6;
		g = container_distinguish1;
		h = container_distinguish2;
		i = container_distinguish3;
		j = container_distinguish4;
		k = container_distinguish5;
		l = container_distinguish6;
		changetype_cancel.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				write(a, b, c, d, e, f, g, h, i, j, k, l);
				finish();
			}
		});
		changetype_ok.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				finish();
			}
		});
		btn_ticket_change_delelte1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (container_distinguish1 == 0) {
					container_distinguish1 = distinguish1;
				} else if (container_distinguish2 == 0) {
					container_distinguish2 = distinguish1;
				} else if (container_distinguish3 == 0) {
					container_distinguish3 = distinguish1;
				} else if (container_distinguish4 == 0) {
					container_distinguish4 = distinguish1;
				} else if (container_distinguish5 == 0) {
					container_distinguish5 = distinguish1;
				} else if (container_distinguish6 == 0) {
					container_distinguish6 = distinguish1;
				}
				distinguish1 = distinguish2;
				distinguish2 = distinguish3;
				distinguish3 = distinguish4;
				distinguish4 = distinguish5;
				distinguish5 = distinguish6;
				distinguish6 = 0;
				write();
				setimagechange();
				setcontainerimage();
			}
		});
		btn_ticket_change_delelte2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (container_distinguish1 == 0) {
					container_distinguish1 = distinguish2;
				} else if (container_distinguish2 == 0) {
					container_distinguish2 = distinguish2;
				} else if (container_distinguish3 == 0) {
					container_distinguish3 = distinguish2;
				} else if (container_distinguish4 == 0) {
					container_distinguish4 = distinguish2;
				} else if (container_distinguish5 == 0) {
					container_distinguish5 = distinguish2;
				} else if (container_distinguish6 == 0) {
					container_distinguish6 = distinguish2;
				}
				distinguish2 = distinguish3;
				distinguish3 = distinguish4;
				distinguish4 = distinguish5;
				distinguish5 = distinguish6;
				distinguish6 = 0;
				write();
				setimagechange();
				setcontainerimage();
			}
		});
		btn_ticket_change_delelte3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (container_distinguish1 == 0) {
					container_distinguish1 = distinguish3;
				} else if (container_distinguish2 == 0) {
					container_distinguish2 = distinguish3;
				} else if (container_distinguish3 == 0) {
					container_distinguish3 = distinguish3;
				} else if (container_distinguish4 == 0) {
					container_distinguish4 = distinguish3;
				} else if (container_distinguish5 == 0) {
					container_distinguish5 = distinguish3;
				} else if (container_distinguish6 == 0) {
					container_distinguish6 = distinguish3;
				}
				distinguish3 = distinguish4;
				distinguish4 = distinguish5;
				distinguish5 = distinguish6;
				distinguish6 = 0;
				write();
				setimagechange();
				setcontainerimage();
			}
		});
		btn_ticket_change_delelte4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (container_distinguish1 == 0) {
					container_distinguish1 = distinguish4;
				} else if (container_distinguish2 == 0) {
					container_distinguish2 = distinguish4;
				} else if (container_distinguish3 == 0) {
					container_distinguish3 = distinguish4;
				} else if (container_distinguish4 == 0) {
					container_distinguish4 = distinguish4;
				} else if (container_distinguish5 == 0) {
					container_distinguish5 = distinguish4;
				} else if (container_distinguish6 == 0) {
					container_distinguish6 = distinguish4;
				}
				distinguish4 = distinguish5;
				distinguish5 = distinguish6;
				distinguish6 = 0;
				write();
				setimagechange();
				setcontainerimage();
			}
		});
		btn_ticket_change_delelte5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (container_distinguish1 == 0) {
					container_distinguish1 = distinguish5;
				} else if (container_distinguish2 == 0) {
					container_distinguish2 = distinguish5;
				} else if (container_distinguish3 == 0) {
					container_distinguish3 = distinguish5;
				} else if (container_distinguish4 == 0) {
					container_distinguish4 = distinguish5;
				} else if (container_distinguish5 == 0) {
					container_distinguish5 = distinguish5;
				} else if (container_distinguish6 == 0) {
					container_distinguish6 = distinguish5;
				}
//				distinguish4 = distinguish5;
				distinguish5 = distinguish6;
				distinguish6 = 0;
				write();
				setimagechange();
				setcontainerimage();
			}
		});btn_ticket_change_delelte6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (container_distinguish1 == 0) {
					container_distinguish1 = distinguish6;
				} else if (container_distinguish2 == 0) {
					container_distinguish2 = distinguish6;
				} else if (container_distinguish3 == 0) {
					container_distinguish3 = distinguish6;
				} else if (container_distinguish4 == 0) {
					container_distinguish4 = distinguish6;
				} else if (container_distinguish5 == 0) {
					container_distinguish5 = distinguish6;
				} else if (container_distinguish6 == 0) {
					container_distinguish6 = distinguish6;
				}
				// distinguish4 = distinguish5;
				// distinguish5 = distinguish6;
				distinguish6 = 0;
				write();
				setimagechange();
				setcontainerimage();
			}
		});
		btn_ticket_container_add1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (distinguish1 == 0) {
					distinguish1 = container_distinguish1;
				} else if (distinguish2 == 0) {
					distinguish2 = container_distinguish1;
				} else if (distinguish3 == 0) {
					distinguish3 = container_distinguish1;
				} else if (distinguish4 == 0) {
					distinguish4 = container_distinguish1;
				} else if (distinguish5 == 0) {
					distinguish5 = container_distinguish1;
				} else if (distinguish6 == 0) {
					distinguish6 = container_distinguish1;
				}
				container_distinguish1 = container_distinguish2;
				container_distinguish2 = container_distinguish3;
				container_distinguish3 = container_distinguish4;
				container_distinguish4 = container_distinguish5;
				container_distinguish5 = container_distinguish6;
				container_distinguish6 = 0;
				write();
				setimagechange();
				setcontainerimage();
			}
		});
		btn_ticket_container_add2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (distinguish1 == 0) {
					distinguish1 = container_distinguish2;
				} else if (distinguish2 == 0) {
					distinguish2 = container_distinguish2;
				} else if (distinguish3 == 0) {
					distinguish3 = container_distinguish2;
				} else if (distinguish4 == 0) {
					distinguish4 = container_distinguish2;
				} else if (distinguish5 == 0) {
					distinguish5 = container_distinguish2;
				} else if (distinguish6 == 0) {
					distinguish6 = container_distinguish2;
				}
				container_distinguish2 = container_distinguish3;
				container_distinguish3 = container_distinguish4;
				container_distinguish4 = container_distinguish5;
				container_distinguish5 = container_distinguish6;
				container_distinguish6 = 0;
				write();
				setimagechange();
				setcontainerimage();
			}
		});
		btn_ticket_container_add3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (distinguish1 == 0) {
					distinguish1 = container_distinguish3;
				} else if (distinguish2 == 0) {
					distinguish2 = container_distinguish3;
				} else if (distinguish3 == 0) {
					distinguish3 = container_distinguish3;
				} else if (distinguish4 == 0) {
					distinguish4 = container_distinguish3;
				} else if (distinguish5 == 0) {
					distinguish5 = container_distinguish3;
				} else if (distinguish6 == 0) {
					distinguish6 = container_distinguish3;
				}
				container_distinguish3 = container_distinguish4;
				container_distinguish4 = container_distinguish5;
				container_distinguish5 = container_distinguish6;
				container_distinguish6 = 0;
				write();
				setimagechange();
				setcontainerimage();
			}
		});
		btn_ticket_container_add4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (distinguish1 == 0) {
					distinguish1 = container_distinguish4;
				} else if (distinguish2 == 0) {
					distinguish2 = container_distinguish4;
				} else if (distinguish3 == 0) {
					distinguish3 = container_distinguish4;
				} else if (distinguish4 == 0) {
					distinguish4 = container_distinguish4;
				} else if (distinguish5 == 0) {
					distinguish5 = container_distinguish4;
				} else if (distinguish6 == 0) {
					distinguish6 = container_distinguish4;
				}
				container_distinguish4 = container_distinguish5;
				container_distinguish5 = container_distinguish6;
				container_distinguish6 = 0;
				write();
				setimagechange();
				setcontainerimage();
			}
		});btn_ticket_container_add5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (distinguish1 == 0) {
					distinguish1 = container_distinguish5;
				} else if (distinguish2 == 0) {
					distinguish2 = container_distinguish5;
				} else if (distinguish3 == 0) {
					distinguish3 = container_distinguish5;
				} else if (distinguish4 == 0) {
					distinguish4 = container_distinguish5;
				} else if (distinguish5 == 0) {
					distinguish5 = container_distinguish5;
				} else if (distinguish6 == 0) {
					distinguish6 = container_distinguish5;
				}
//				container_distinguish4 = container_distinguish5;
				container_distinguish5 = container_distinguish6;
				container_distinguish6 = 0;
				write();
				setimagechange();
				setcontainerimage();
			}
		});btn_ticket_container_add6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (distinguish1 == 0) {
					distinguish1 = container_distinguish6;
				} else if (distinguish2 == 0) {
					distinguish2 = container_distinguish6;
				} else if (distinguish3 == 0) {
					distinguish3 = container_distinguish6;
				} else if (distinguish4 == 0) {
					distinguish4 = container_distinguish6;
				} else if (distinguish5 == 0) {
					distinguish5 = container_distinguish6;
				} else if (distinguish6 == 0) {
					distinguish6 = container_distinguish6;
				}
				// container_distinguish4 = container_distinguish5;
				//	container_distinguish5 = container_distinguish6;
				container_distinguish6 = 0;
				write();
				setimagechange();
				setcontainerimage();
			}
		});
	}

	protected void write(int a2, int b2, int c2, int d2, int e2, int f2, int g2, int h2, int i2, int j2, int k2,
			int l2) {
		// TODO Auto-generated method stub
		Editor edit = pre.edit();
		edit.putInt("distinguish1", a2);
		edit.putInt("distinguish2", b2);
		edit.putInt("distinguish3", c2);
		edit.putInt("distinguish4", d2);
		edit.putInt("distinguish5", e2);
		edit.putInt("distinguish6", f2);
		edit.putInt("container_distinguish1", g2);
		edit.putInt("container_distinguish2", h2);
		edit.putInt("container_distinguish3", i2);
		edit.putInt("container_distinguish4", j2);
		edit.putInt("container_distinguish5", k2);
		edit.putInt("container_distinguish6", l2);
		edit.commit();
	}

	protected void write() {
		// TODO Auto-generated method stub
		Editor edit = pre.edit();
		edit.putInt("distinguish1", distinguish1);
		edit.putInt("distinguish2", distinguish2);
		edit.putInt("distinguish3", distinguish3);
		edit.putInt("distinguish4", distinguish4);
		edit.putInt("distinguish5", distinguish5);
		edit.putInt("distinguish6", distinguish6);
		edit.putInt("container_distinguish1", container_distinguish1);
		edit.putInt("container_distinguish2", container_distinguish2);
		edit.putInt("container_distinguish3", container_distinguish3);
		edit.putInt("container_distinguish4", container_distinguish4);
		edit.putInt("container_distinguish5", container_distinguish5);
		edit.putInt("container_distinguish6", container_distinguish6);
		edit.commit();
	}

	private void setcontainerimage() {
		// TODO Auto-generated method stub
		switch (container_distinguish1) {
		case 0:
			btn_ticket_container1.setImageResource(0);
			btn_ticket_container_add1.setImageResource(0);
			break;
		case 1:
			btn_ticket_container1.setImageResource(R.drawable.image_tj);
			btn_ticket_container_add1.setImageResource(R.drawable.add_tickettype);
			break;
		case 2:
			btn_ticket_container1.setImageResource(R.drawable.image_xj);
			btn_ticket_container_add1.setImageResource(R.drawable.add_tickettype);
			break;
		case 3:
			btn_ticket_container1.setImageResource(R.drawable.image_jx);
			btn_ticket_container_add1.setImageResource(R.drawable.add_tickettype);
			break;
		case 4:
			btn_ticket_container1.setImageResource(R.drawable.image_cq);
			btn_ticket_container_add1.setImageResource(R.drawable.add_tickettype);
			break;
		case 5:
			btn_ticket_container1.setImageResource(R.drawable.main_3d);
			btn_ticket_container_add1.setImageResource(R.drawable.add_tickettype);
			break;
		case 6:
			btn_ticket_container1.setImageResource(R.drawable.main_pailie3);
			btn_ticket_container_add1.setImageResource(R.drawable.add_tickettype);
			break;

		default:
			break;
		}
		switch (container_distinguish2) {
		case 0:
			btn_ticket_container2.setImageResource(0);
			btn_ticket_container_add2.setImageResource(0);
			break;
		case 1:
			btn_ticket_container2.setImageResource(R.drawable.image_tj);
			btn_ticket_container_add2.setImageResource(R.drawable.add_tickettype);
			break;
		case 2:
			btn_ticket_container2.setImageResource(R.drawable.image_xj);
			btn_ticket_container_add2.setImageResource(R.drawable.add_tickettype);
			break;
		case 3:
			btn_ticket_container2.setImageResource(R.drawable.image_jx);
			btn_ticket_container_add2.setImageResource(R.drawable.add_tickettype);
			break;
		case 4:
			btn_ticket_container2.setImageResource(R.drawable.image_cq);
			btn_ticket_container_add2.setImageResource(R.drawable.add_tickettype);
			break;
		case 5:
			btn_ticket_container2.setImageResource(R.drawable.main_3d);
			btn_ticket_container_add2.setImageResource(R.drawable.add_tickettype);
			break;
		case 6:
			btn_ticket_container2.setImageResource(R.drawable.main_pailie3);
			btn_ticket_container_add2.setImageResource(R.drawable.add_tickettype);
			break;
		default:
			break;
		}
		switch (container_distinguish3) {
		case 0:
			btn_ticket_container3.setImageResource(0);
			btn_ticket_container_add3.setImageResource(0);
			break;
		case 1:
			btn_ticket_container3.setImageResource(R.drawable.image_tj);
			btn_ticket_container_add3.setImageResource(R.drawable.add_tickettype);
			break;
		case 2:
			btn_ticket_container3.setImageResource(R.drawable.image_xj);
			btn_ticket_container_add3.setImageResource(R.drawable.add_tickettype);
			break;
		case 3:
			btn_ticket_container3.setImageResource(R.drawable.image_jx);
			btn_ticket_container_add3.setImageResource(R.drawable.add_tickettype);
			break;
		case 4:
			btn_ticket_container3.setImageResource(R.drawable.image_cq);
			btn_ticket_container_add3.setImageResource(R.drawable.add_tickettype);
			break;
		case 5:
			btn_ticket_container3.setImageResource(R.drawable.main_3d);
			btn_ticket_container_add3.setImageResource(R.drawable.add_tickettype);
			break;
		case 6:
			btn_ticket_container3.setImageResource(R.drawable.main_pailie3);
			btn_ticket_container_add3.setImageResource(R.drawable.add_tickettype);
			break;
		default:
			break;
		}
		switch (container_distinguish4) {
		case 0:
			btn_ticket_container4.setImageResource(0);
			btn_ticket_container_add4.setImageResource(0);
			break;
		case 1:
			btn_ticket_container4.setImageResource(R.drawable.image_tj);
			btn_ticket_container_add4.setImageResource(R.drawable.add_tickettype);
			break;
		case 2:
			btn_ticket_container4.setImageResource(R.drawable.image_xj);
			btn_ticket_container_add4.setImageResource(R.drawable.add_tickettype);
			break;
		case 3:
			btn_ticket_container4.setImageResource(R.drawable.image_jx);
			btn_ticket_container_add4.setImageResource(R.drawable.add_tickettype);
			break;
		case 4:
			btn_ticket_container4.setImageResource(R.drawable.image_cq);
			btn_ticket_container_add4.setImageResource(R.drawable.add_tickettype);
			break;
		case 5:
			btn_ticket_container4.setImageResource(R.drawable.main_3d);
			btn_ticket_container_add4.setImageResource(R.drawable.add_tickettype);
			break;
		case 6:
			btn_ticket_container4.setImageResource(R.drawable.main_pailie3);
			btn_ticket_container_add4.setImageResource(R.drawable.add_tickettype);
			break;
		default:
			break;
		}
		switch (container_distinguish5) {
		case 0:
			btn_ticket_container5.setImageResource(0);
			btn_ticket_container_add5.setImageResource(0);
			break;
		case 1:
			btn_ticket_container5.setImageResource(R.drawable.image_tj);
			btn_ticket_container_add5.setImageResource(R.drawable.add_tickettype);
			break;
		case 2:
			btn_ticket_container5.setImageResource(R.drawable.image_xj);
			btn_ticket_container_add5.setImageResource(R.drawable.add_tickettype);
			break;
		case 3:
			btn_ticket_container5.setImageResource(R.drawable.image_jx);
			btn_ticket_container_add5.setImageResource(R.drawable.add_tickettype);
			break;
		case 4:
			btn_ticket_container5.setImageResource(R.drawable.image_cq);
			btn_ticket_container_add5.setImageResource(R.drawable.add_tickettype);
			break;
		case 5:
			btn_ticket_container5.setImageResource(R.drawable.main_3d);
			btn_ticket_container_add5.setImageResource(R.drawable.add_tickettype);
			break;
		case 6:
			btn_ticket_container5.setImageResource(R.drawable.main_pailie3);
			btn_ticket_container_add5.setImageResource(R.drawable.add_tickettype);
			break;
		default:
			break;
		}
		switch (container_distinguish6) {
		case 0:
			btn_ticket_container6.setImageResource(0);
			btn_ticket_container_add6.setImageResource(0);
			break;
		case 1:
			btn_ticket_container6.setImageResource(R.drawable.image_tj);
			btn_ticket_container_add6.setImageResource(R.drawable.add_tickettype);
			break;
		case 2:
			btn_ticket_container6.setImageResource(R.drawable.image_xj);
			btn_ticket_container_add6.setImageResource(R.drawable.add_tickettype);
			break;
		case 3:
			btn_ticket_container6.setImageResource(R.drawable.image_jx);
			btn_ticket_container_add6.setImageResource(R.drawable.add_tickettype);
			break;
		case 4:
			btn_ticket_container6.setImageResource(R.drawable.image_cq);
			btn_ticket_container_add6.setImageResource(R.drawable.add_tickettype);
			break;
		case 5:
			btn_ticket_container6.setImageResource(R.drawable.main_3d);
			btn_ticket_container_add6.setImageResource(R.drawable.add_tickettype);
			break;
		case 6:
			btn_ticket_container6.setImageResource(R.drawable.main_pailie3);
			btn_ticket_container_add6.setImageResource(R.drawable.add_tickettype);
			break;
		default:
			break;
		}
	}

	private void readcontainer() {
		// TODO Auto-generated method stub
		container_distinguish1 = pre.getInt("container_distinguish1", 0);
		container_distinguish2 = pre.getInt("container_distinguish2", 0);
		container_distinguish3 = pre.getInt("container_distinguish3", 0);
		container_distinguish4 = pre.getInt("container_distinguish4", 0);
		container_distinguish5 = pre.getInt("container_distinguish5", 0);
		container_distinguish6 = pre.getInt("container_distinguish6", 0);
	}

	private void setimagechange() {
		// TODO Auto-generated method stub
		switch (distinguish1) {
		case 0:
			btn_ticket_change1.setImageResource(0);
			btn_ticket_change_delelte1.setImageResource(0);
			break;
		case 1:
			btn_ticket_change1.setImageResource(R.drawable.image_tj);
			btn_ticket_change_delelte1.setImageResource(R.drawable.delete_tickettype);
			break;
		case 2:
			btn_ticket_change1.setImageResource(R.drawable.image_xj);
			btn_ticket_change_delelte1.setImageResource(R.drawable.delete_tickettype);
			break;
		case 3:
			btn_ticket_change1.setImageResource(R.drawable.image_jx);
			btn_ticket_change_delelte1.setImageResource(R.drawable.delete_tickettype);
			break;
		case 4:
			btn_ticket_change1.setImageResource(R.drawable.image_cq);
			btn_ticket_change_delelte1.setImageResource(R.drawable.delete_tickettype);
			break;
		case 5:
			btn_ticket_change1.setImageResource(R.drawable.main_3d);
			btn_ticket_change_delelte1.setImageResource(R.drawable.delete_tickettype);
			break;
		case 6:
			btn_ticket_change1.setImageResource(R.drawable.main_pailie3);
			btn_ticket_change_delelte1.setImageResource(R.drawable.delete_tickettype);
			break;

		default:
			break;
		}
		switch (distinguish2) {
		case 0:
			btn_ticket_change2.setImageResource(0);
			btn_ticket_change_delelte2.setImageResource(0);
			break;
		case 1:
			btn_ticket_change2.setImageResource(R.drawable.image_tj);
			btn_ticket_change_delelte2.setImageResource(R.drawable.delete_tickettype);
			break;
		case 2:
			btn_ticket_change2.setImageResource(R.drawable.image_xj);
			btn_ticket_change_delelte2.setImageResource(R.drawable.delete_tickettype);
			break;
		case 3:
			btn_ticket_change2.setImageResource(R.drawable.image_jx);
			btn_ticket_change_delelte2.setImageResource(R.drawable.delete_tickettype);
			break;
		case 4:
			btn_ticket_change2.setImageResource(R.drawable.image_cq);
			btn_ticket_change_delelte2.setImageResource(R.drawable.delete_tickettype);
			break;
		case 5:
			btn_ticket_change2.setImageResource(R.drawable.main_3d);
			btn_ticket_change_delelte2.setImageResource(R.drawable.delete_tickettype);
			break;
		case 6:
			btn_ticket_change2.setImageResource(R.drawable.main_pailie3);
			btn_ticket_change_delelte2.setImageResource(R.drawable.delete_tickettype);
			break;
		default:
			break;
		}
		switch (distinguish3) {
		case 0:
			btn_ticket_change3.setImageResource(0);
			btn_ticket_change_delelte3.setImageResource(0);
			break;
		case 1:
			btn_ticket_change3.setImageResource(R.drawable.image_tj);
			btn_ticket_change_delelte3.setImageResource(R.drawable.delete_tickettype);
			break;
		case 2:
			btn_ticket_change3.setImageResource(R.drawable.image_xj);
			btn_ticket_change_delelte3.setImageResource(R.drawable.delete_tickettype);
			break;
		case 3:
			btn_ticket_change3.setImageResource(R.drawable.image_jx);
			btn_ticket_change_delelte3.setImageResource(R.drawable.delete_tickettype);
			break;
		case 4:
			btn_ticket_change3.setImageResource(R.drawable.image_cq);
			btn_ticket_change_delelte3.setImageResource(R.drawable.delete_tickettype);
			break;
		case 5:
			btn_ticket_change3.setImageResource(R.drawable.main_3d);
			btn_ticket_change_delelte3.setImageResource(R.drawable.delete_tickettype);
			break;
		case 6:
			btn_ticket_change3.setImageResource(R.drawable.main_pailie3);
			btn_ticket_change_delelte3.setImageResource(R.drawable.delete_tickettype);
			break;
		default:
			break;
		}
		switch (distinguish4) {
		case 0:
			btn_ticket_change4.setImageResource(0);
			btn_ticket_change_delelte4.setImageResource(0);
			break;
		case 1:
			btn_ticket_change4.setImageResource(R.drawable.image_tj);
			btn_ticket_change_delelte4.setImageResource(R.drawable.delete_tickettype);
			break;
		case 2:
			btn_ticket_change4.setImageResource(R.drawable.image_xj);
			btn_ticket_change_delelte4.setImageResource(R.drawable.delete_tickettype);
			break;
		case 3:
			btn_ticket_change4.setImageResource(R.drawable.image_jx);
			btn_ticket_change_delelte4.setImageResource(R.drawable.delete_tickettype);
			break;
		case 4:
			btn_ticket_change4.setImageResource(R.drawable.image_cq);
			btn_ticket_change_delelte4.setImageResource(R.drawable.delete_tickettype);
			break;
		case 5:
			btn_ticket_change4.setImageResource(R.drawable.main_3d);
			btn_ticket_change_delelte4.setImageResource(R.drawable.delete_tickettype);
			break;
		case 6:
			btn_ticket_change4.setImageResource(R.drawable.main_pailie3);
			btn_ticket_change_delelte4.setImageResource(R.drawable.delete_tickettype);
			break;
		default:
			break;
		}
		switch (distinguish5) {
		case 0:
			btn_ticket_change5.setImageResource(0);
			btn_ticket_change_delelte5.setImageResource(0);
			break;
		case 1:
			btn_ticket_change5.setImageResource(R.drawable.image_tj);
			btn_ticket_change_delelte5.setImageResource(R.drawable.delete_tickettype);
			break;
		case 2:
			btn_ticket_change5.setImageResource(R.drawable.image_xj);
			btn_ticket_change_delelte5.setImageResource(R.drawable.delete_tickettype);
			break;
		case 3:
			btn_ticket_change5.setImageResource(R.drawable.image_jx);
			btn_ticket_change_delelte5.setImageResource(R.drawable.delete_tickettype);
			break;
		case 4:
			btn_ticket_change5.setImageResource(R.drawable.image_cq);
			btn_ticket_change_delelte5.setImageResource(R.drawable.delete_tickettype);
			break;
		case 5:
			btn_ticket_change5.setImageResource(R.drawable.main_3d);
			btn_ticket_change_delelte5.setImageResource(R.drawable.delete_tickettype);
			break;
		case 6:
			btn_ticket_change5.setImageResource(R.drawable.main_pailie3);
			btn_ticket_change_delelte5.setImageResource(R.drawable.delete_tickettype);
			break;
		default:
			break;
		}
		switch (distinguish6) {
		case 0:
			btn_ticket_change6.setImageResource(0);
			btn_ticket_change_delelte6.setImageResource(0);
			break;
		case 1:
			btn_ticket_change6.setImageResource(R.drawable.image_tj);
			btn_ticket_change_delelte6.setImageResource(R.drawable.delete_tickettype);
			break;
		case 2:
			btn_ticket_change6.setImageResource(R.drawable.image_xj);
			btn_ticket_change_delelte6.setImageResource(R.drawable.delete_tickettype);
			break;
		case 3:
			btn_ticket_change6.setImageResource(R.drawable.image_jx);
			btn_ticket_change_delelte6.setImageResource(R.drawable.delete_tickettype);
			break;
		case 4:
			btn_ticket_change6.setImageResource(R.drawable.image_cq);
			btn_ticket_change_delelte6.setImageResource(R.drawable.delete_tickettype);
			break;
		case 5:
			btn_ticket_change6.setImageResource(R.drawable.main_3d);
			btn_ticket_change_delelte6.setImageResource(R.drawable.delete_tickettype);
			break;
		case 6:
			btn_ticket_change6.setImageResource(R.drawable.main_pailie3);
			btn_ticket_change_delelte6.setImageResource(R.drawable.delete_tickettype);
			break;
		default:
			break;
		}

	}

	private void initialize() {
		// TODO Auto-generated method stub
		btn_ticket_change1 = (ImageButton) findViewById(R.id.btn_ticket_change1);
		btn_ticket_change2 = (ImageButton) findViewById(R.id.btn_ticket_change2);
		btn_ticket_change3 = (ImageButton) findViewById(R.id.btn_ticket_change3);
		btn_ticket_change4 = (ImageButton) findViewById(R.id.btn_ticket_change4);
		btn_ticket_change5 = (ImageButton) findViewById(R.id.btn_ticket_change5);
		btn_ticket_change6 = (ImageButton) findViewById(R.id.btn_ticket_change6);
		btn_ticket_change_delelte1 = (ImageButton) findViewById(R.id.btn_ticket_change_delelte1);
		btn_ticket_change_delelte2 = (ImageButton) findViewById(R.id.btn_ticket_change_delelte2);
		btn_ticket_change_delelte3 = (ImageButton) findViewById(R.id.btn_ticket_change_delelte3);
		btn_ticket_change_delelte4 = (ImageButton) findViewById(R.id.btn_ticket_change_delelte4);
		btn_ticket_change_delelte5 = (ImageButton) findViewById(R.id.btn_ticket_change_delelte5);
		btn_ticket_change_delelte6 = (ImageButton) findViewById(R.id.btn_ticket_change_delelte6);
		btn_ticket_container1 = (ImageButton) findViewById(R.id.btn_ticket_container1);
		btn_ticket_container2 = (ImageButton) findViewById(R.id.btn_ticket_container2);
		btn_ticket_container3 = (ImageButton) findViewById(R.id.btn_ticket_container3);
		btn_ticket_container4 = (ImageButton) findViewById(R.id.btn_ticket_container4);
		btn_ticket_container5 = (ImageButton) findViewById(R.id.btn_ticket_container5);
		btn_ticket_container6 = (ImageButton) findViewById(R.id.btn_ticket_container6);
		btn_ticket_container_add1 = (ImageButton) findViewById(R.id.btn_ticket_container_add1);
		btn_ticket_container_add2 = (ImageButton) findViewById(R.id.btn_ticket_container_add2);
		btn_ticket_container_add3 = (ImageButton) findViewById(R.id.btn_ticket_container_add3);
		btn_ticket_container_add4 = (ImageButton) findViewById(R.id.btn_ticket_container_add4);
		btn_ticket_container_add5 = (ImageButton) findViewById(R.id.btn_ticket_container_add5);
		btn_ticket_container_add6 = (ImageButton) findViewById(R.id.btn_ticket_container_add6);
		Intent intent = getIntent();
		distinguish1 = intent.getIntExtra("distinguish1", 0);
		distinguish2 = intent.getIntExtra("distinguish2", 0);
		distinguish3 = intent.getIntExtra("distinguish3", 0);
		distinguish4 = intent.getIntExtra("distinguish4", 0);
		distinguish5 = intent.getIntExtra("distinguish5", 0);
		distinguish6 = intent.getIntExtra("distinguish6", 0);
		Log.d("rid", "str");
		Log.d("rid", "str" + distinguish1);
		Log.d("rid", "str" + distinguish2);
		Log.d("rid", "str" + distinguish3);
		Log.d("rid", "str" + distinguish4);
		Log.d("rid", "str" + distinguish5);
		Log.d("rid", "str" + distinguish6);
		pre = getSharedPreferences("custominfo", MODE_PRIVATE);
		changetype_ok = (TextView) findViewById(R.id.changetype_ok);
		changetype_cancel = (TextView) findViewById(R.id.changetype_cancel);
	}

}
