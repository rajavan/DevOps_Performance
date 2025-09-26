/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.jmeter.runtime.action.JmeterAction;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.UserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class Schedule_A1EEEA787D9B5110D1C2B36532353632 extends com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public Schedule_A1EEEA787D9B5110D1C2B36532353632(IContainer parent, String name) {
		super(parent, name, "A1EEEA787D9B5110D1C2B36532353632");
		super.actualScheduleName = "jmeter-example-VUSch";
		setThinkMax(10000);
		setThinkScheme(IKThinkControl.RECORDED);

	}

	public void execute() {

		this.addUserGroup(new UserGroup_1(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "User Group 1", "A1EEEA787EA4F8E4D1C2B36532353632");

			setNumUsers(100.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "Default Scenario", "A1EEEA787EA4F8EFD1C2B36532353632") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					For loopNm_1 = Loop_1(this);
					this.add(loopNm_1);
					loopNm_1.addVarsToInit(null);

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent, "Loop1", "A1EEEA787EA65875D1C2B36532353632", -1, 0, 0, 0, 1, true, false, null) {

			public void executeLoop() {

				this.add(JmeterTestInvocation_1(this));
				super.executeLoop();
			}

		};
		return forLoop;
	}

	private JmeterAction JmeterTestInvocation_1(IContainer parent) {
		return new JmeterAction(parent, "jmeter-example_Thread Group.jmx", "A1EEEA787EA65870D1C2B36532353632");
	}

}