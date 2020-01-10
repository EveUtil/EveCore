package pro.mori.eveCore;


import com.alibaba.fastjson.JSONObject;
import pro.mori.moriUtil.Util.ClassUtil;
import pro.mori.moriUtil.Util.FormatUtil;
import pro.mori.moriUtil.Util.HttpClient;
import pro.mori.moriUtil.Util.impl.classImpl;
import pro.mori.moriUtil.Util.impl.formatImpl;
import pro.mori.moriUtil.Util.impl.httpClientImpl;
import pro.mori.moriUtil.common.FinalEnum;
import pro.mori.moriUtil.common.HttpEnum;
import pro.mori.moriUtil.common.UrlEnum;
import pro.mori.moriUtil.model.ListInfo;
import pro.mori.moriUtil.model.PostInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class doom {

    private ClassUtil classUtil = new classImpl();

    private FormatUtil formatUtil = new formatImpl();

    private HttpClient httpClient = new httpClientImpl();

    private PostInfo postInfo = new PostInfo();

    private Class<?> cls;

    private String[] args;

    private String[] queryInfo = new String[2];
//test
    public doom(Class<?> cls,String[] args) {
        this.cls = cls;
        this.args = args;
    }

    public void run() {
        System.out.println("执行成功");

    }

    public doom test(){
        System.out.println("初始化查询依赖是否存在");
        System.out.println(formatUtil.test());
        return this;
    }

    public doom test_Class(){
        System.out.println("初始化客户端位置");
        System.out.println(classUtil.getClassPath(cls));
        return this;
    }

    public doom test_Url() {
        System.out.println("初始化Url");
        System.out.println(UrlEnum.EVE_PRICE_API.getMag());
        return this;
    }

    public doom test_UrlEcoding() {
        System.out.println("初始化Ecoding编码器");
//        httpClient.getParam(queryInfo);
        return this;
    }

    public doom test_UrlPost(){
        postInfo.setType(HttpEnum.FROM.getType());

        postInfo.setUrl(
                        UrlEnum.EVE_PRICE_API.getMag() +
                        FinalEnum.URL_ONE.getName() +
                        FinalEnum.MARK.getName() +
                        FinalEnum.URL_DENG.getName() +
                        queryInfo[0]);
        postInfo.setParam(FinalEnum.ROW_LIST.getName() + FinalEnum.URL_DENG.getName() + queryInfo[1]);

        System.out.println(postInfo);
        try {
            JSONObject a = httpClient.postGeneralUrl(postInfo);
            System.out.println(a.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }

    public doom test_Input() {
        System.out.print("请输入查询地[默认为吉他(jita)] : ");
        Scanner input = new Scanner(System.in);
        queryInfo[0] = input.nextLine();
        System.out.println("请输入内容 : ");
        queryInfo[1] = "";
        List<String> n1 = new ArrayList<>();
        //对输入内容进行初步分割处理
        do {
            String string = input.nextLine();
            if (string.equals("")) {
                break;
            }
            queryInfo[1] += string;
            n1.add(string);

        } while (true);


        //调试输出部分
        System.out.println("--> " + queryInfo[0]);
        for (String s : n1){
            System.out.println(" --> " + s);
        }

        System.out.println("----------------------------------------");


        //对输入内容进行第二次分割处理
        List<ListInfo> n2;
        for (String s : n1){
            ListInfo typeList = new ListInfo();

            String[] len = s.split("\t");
            for (String y : len){
                System.out.println(y);
            }

//            typeList.setName();
//            typeList.setAmount();
//            typeList.setClass();
//            typeList.setGroup();
        }









        return this;
    }
}
