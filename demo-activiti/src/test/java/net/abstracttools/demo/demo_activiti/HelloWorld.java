package net.abstracttools.demo.demo_activiti;

import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Before;
import org.junit.Test;

public class HelloWorld {

    ProcessEngine processEngine = null;

    @Before
    public void getProcessEngine() {
        ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration
                .createProcessEngineConfigurationFromResource(
                        "activiti.cfg.xml");
        processEngine = processEngineConfiguration.buildProcessEngine();

        System.out.println(processEngine);

    }

    //@Test
    public void deploy() {
        RepositoryService positoryService = processEngine
                .getRepositoryService();
        DeploymentBuilder deploymentBuilder = positoryService
                .createDeployment();
        deploymentBuilder.name("helloworld");
        deploymentBuilder.addClasspathResource("helloworld.bpmn");
        Deployment deployment = deploymentBuilder.deploy();

        System.out.println("部署ID:" + deployment.getId());
        System.out.println("部署名称：" + deployment.getName());
    }

    /**
     * 启动流程实例
     */
    @Test
    public void startProcessInstance() {
        // 流程定义的key
        String processDefinitionKey = "myProcess";
        ProcessInstance pi = processEngine.getRuntimeService()
                .startProcessInstanceByKey(processDefinitionKey);// 使用流程定义的key启动流程实例，key对应hellworld.bpmn文件中id的属性值，使用key值启动，默认是按照最新版本的流程定义启动
        System.out.println("流程实例ID:" + pi.getId());// 流程实例ID 101
        System.out.println("流程定义ID:" + pi.getProcessDefinitionId()); // 流程定义ID HelloWorld:1:4
    }

}
