/*******************************************************************************************************
 * Continued by PikaMug (formerly HappyPikachu) with permission from _Blackvein_. All rights reserved.
 * 
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN
 * NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
 * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************************************/

package me.blackvein.quests.exceptions;

import me.blackvein.quests.Quest;

public class InvalidStageException extends Exception {

    private static final long serialVersionUID = 1778748295752972651L;
    private final Quest quest;
    private final int stage;

    /**
     * Create a new instance of this class with the afflicted quest and stage number.
     * 
     * @param quest The quest that an invalid stage id was set within.
     * @param stage The invalid stage id that was set.
     */
    public InvalidStageException(Quest quest, int stage) {
        this.quest = quest;
        this.stage = stage;
    }

    /**
     * Get the quest instance associated with this exception.
     * 
     * @return The quest that an invalid stage id was set within.
     */
    public Quest getQuest() {
        return quest;
    }

    /**
     * Get the invalid stage id that was attempted to be set within the quest class.
     * 
     * @return The invalid stage id that was set.
     */
    public int getStage() {
        return stage;
    }
}
