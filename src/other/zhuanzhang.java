package other;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.entertiment.util.Util;
import com.example.lottery.R;

import android.R.string;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class zhuanzhang extends Activity {
	private Spinner zhuanru_spinner;
	private Spinner zhuanchu_spinner;
	private String strzhuanru = "中心钱包", strzhuanchu = "中心钱包";
	private ArrayAdapter<CharSequence> zhuanru_adapter;
	private ArrayAdapter<CharSequence> zhuanchu_adapter;
	private LinearLayout Lin_back;
	private EditText edit_jine;
	private Button btn_zhuanzhangok;
	private TextView text_result;
	private String jine = "";
	private String sour = "";
	private String desc = "";
	private SharedPreferences cookiesdetail;
	private String cookies;
	private double jin = 0;
	private int temp = 0;
	private String msg = "绑定失败";
	private Handler uiHandler = new Handler() {
		@Override
		public void handleMessage(Message msg1) {
			switch (msg1.what) {
			case 1:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "yjygj");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				// getnew();
				// address.this.statusTextView.setText("文件下载完成");
				break;
			case 2:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "hjj6666");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				go();
				// address.this.statusTextView.setText("文件下载完成");
				break;
			}
		}

	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.other_zhuanzhang);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		Lin_back = (LinearLayout) findViewById(R.id.Lin_back);
		edit_jine = (EditText) findViewById(R.id.edit_jine);
		btn_zhuanzhangok = (Button) findViewById(R.id.btn_zhuanzhangok);
		text_result = (TextView) findViewById(R.id.text_result);
		text_result.setVisibility(View.GONE);
		zhuanchu_spinner = (Spinner) findViewById(R.id.zhuanchu_spinner);
		zhuanchu_adapter = ArrayAdapter.createFromResource(this, R.array.zhuanzhang,
				android.R.layout.simple_spinner_item);
		zhuanchu_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		zhuanchu_spinner.setAdapter(zhuanchu_adapter);
		zhuanchu_spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				strzhuanchu = zhuanchu_spinner.getSelectedItem().toString();
				// display.setText(strProvince+"-"+strCity+"-"+strCounty);
				Log.e("ghgh", strzhuanchu);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {

			}

		});
		zhuanru_spinner = (Spinner) findViewById(R.id.zhuanru_spinner);
		zhuanru_adapter = ArrayAdapter.createFromResource(this, R.array.zhuanzhang,
				android.R.layout.simple_spinner_item);
		zhuanru_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		zhuanru_spinner.setAdapter(zhuanru_adapter);
		zhuanru_spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				strzhuanru = zhuanru_spinner.getSelectedItem().toString();
				// display.setText(strProvince+"-"+strCity+"-"+strCounty);
				Log.e("ghgh", strzhuanru);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {

			}

		});
		Lin_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		btn_zhuanzhangok.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				jine = edit_jine.getText().toString();
				if (jine.equals("")) {
					Toast.makeText(zhuanzhang.this, "转账金额不可为空", Toast.LENGTH_SHORT).show();
				} else {

					try {
						jin = Double.valueOf(jine);
					} catch (Exception e) {
						Toast.makeText(zhuanzhang.this, "输入数据含有非法字符", Toast.LENGTH_SHORT).show();
					}
					if (jin != 0) {
						if (temp == 0) {
							text_result.setVisibility(View.GONE);
							btn_zhuanzhangok.setText("正在转账...");
							if (strzhuanchu.equals("中心钱包")) {
								sour = "main";
							} else if (strzhuanchu.equals("时时彩")) {
								sour = "ssc";
							} else if (strzhuanchu.equals("11选5")) {
								sour = "shiyi5";
							} else if (strzhuanchu.equals("低频")) {
								sour = "dipin";
							}
							if (strzhuanru.equals("中心钱包")) {
								desc = "main";
							} else if (strzhuanru.equals("时时彩")) {
								desc = "ssc";
							} else if (strzhuanru.equals("11选5")) {
								desc = "shiyi5";
							} else if (strzhuanru.equals("低频")) {
								desc = "dipin";
							}
							temp = 1;
							zhuanzhang();
						} else {
							Toast.makeText(zhuanzhang.this, "正在转账，请稍等", Toast.LENGTH_SHORT).show();
						}

					}

				}
			}
		});

	}

	private void zhuanzhang() {
		Log.d("xxxxx", "1r");
		cookies = cookiesdetail.getString("cookies", "");
		final ArrayList nameValuePairs = new ArrayList();
		nameValuePairs.add(new BasicNameValuePair("source", sour));
		nameValuePairs.add(new BasicNameValuePair("target", desc));
		nameValuePairs.add(new BasicNameValuePair("amount", jine));
		// Log.d("selindex", "selindex" + "read" + selindex);
		new AsyncTask<Void, Void, String>() {

			@Override
			protected String doInBackground(Void... params) {
				StringBuilder sb = null;
				JSONArray jArray = null;
				String result = null;
				InputStream is = null;
				String jsonString = null;
				String data = null;
				// TODO Auto-generated method stub
				DefaultHttpClient httpClient = new DefaultHttpClient();
				Log.d("xxxxx", "1");
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/TransferRmb");
				Log.d("xxxxx", "11");
				httpPost.setHeader("Cookie", cookies);//
				Log.d("xxxxx", "111");

				try {
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
					HttpResponse httpResponse;
					Log.d("xxxxx", "1111");
					httpResponse = httpClient.execute(httpPost);
					Log.d("xxxxx", "12222");
					is = httpResponse.getEntity().getContent();
					Log.e("xxxxx", "14444");
					jsonString = Util.convertStreamToString(is);
					jsonString = "[" + jsonString + "]";
					Log.d("xxxxx", jsonString);
					String t;
					String tz;
					String l;

					try {
						Log.d("xxxxx", "jhkk");
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							msg = json_data.getString("m");
							// game[i] = json_data.getString("game");
							// no[i] = json_data.getString("Value");
							// expect[i] = json_data.getString("No");

						}
						Message msg1 = new Message();
						// // // 便我们做出不同的处理操作
						msg1.what = 2;

						// 我们可以通过arg1和arg2给Message传入简单的数据
						msg1.arg1 = 123;
						msg1.arg2 = 321;
						// 我们也可以通过给obj赋值Object类型传递向Message传入任意数据
						// msg.obj = null;
						// 我们还可以通过setData方法和getData方法向Message中写入和读取Bundle类型的数据
						// msg.setData(null);
						// Bundle data = msg.getData();

						// 将该Message发送给对应的Handler
						uiHandler.sendMessage(msg1);
					} catch (JSONException e1) {
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					// getCookie(httpClient);
					return jsonString;

				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return null;
			}

			// protected void onPostExecute(String result) {
			// tvList.setText(result);
			// };

		}.execute();
	}

	private void go() {
		// TODO Auto-generated method stub
		text_result.setVisibility(View.VISIBLE);
		btn_zhuanzhangok.setText("开始转账");
		text_result.setText(msg);
		temp = 0;
	}
}
