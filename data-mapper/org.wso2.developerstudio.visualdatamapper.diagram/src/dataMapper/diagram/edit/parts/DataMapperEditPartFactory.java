package dataMapper.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class DataMapperEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (dataMapper.diagram.part.DataMapperVisualIDRegistry.getVisualID(view)) {

			case dataMapper.diagram.edit.parts.DataMapperRootEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.DataMapperRootEditPart(view);

			case dataMapper.diagram.edit.parts.InputEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.InputEditPart(view);

			case dataMapper.diagram.edit.parts.OutputEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.OutputEditPart(view);

			case dataMapper.diagram.edit.parts.EqualEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.EqualEditPart(view);

			case dataMapper.diagram.edit.parts.ConcatEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.ConcatEditPart(view);

			case dataMapper.diagram.edit.parts.SplitEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.SplitEditPart(view);

			case dataMapper.diagram.edit.parts.ConstantEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.ConstantEditPart(view);

			case dataMapper.diagram.edit.parts.LowerCaseEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.LowerCaseEditPart(view);

			case dataMapper.diagram.edit.parts.ContainsEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.ContainsEditPart(view);

			case dataMapper.diagram.edit.parts.TreeNodeEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.TreeNodeEditPart(view);

			case dataMapper.diagram.edit.parts.TreeNode2EditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.TreeNode2EditPart(view);

			case dataMapper.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.AttributeEditPart(view);

			case dataMapper.diagram.edit.parts.InNodeEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.InNodeEditPart(view);

			case dataMapper.diagram.edit.parts.OutNodeEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.OutNodeEditPart(view);

			case dataMapper.diagram.edit.parts.ElementEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.ElementEditPart(view);

			case dataMapper.diagram.edit.parts.InNode2EditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.InNode2EditPart(view);

			case dataMapper.diagram.edit.parts.OutNode2EditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.OutNode2EditPart(view);

			case dataMapper.diagram.edit.parts.TreeNode3EditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.TreeNode3EditPart(view);

			case dataMapper.diagram.edit.parts.OperatorBasicContainerEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.OperatorBasicContainerEditPart(view);

			case dataMapper.diagram.edit.parts.OperatorLeftContainerEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.OperatorLeftContainerEditPart(view);

			case dataMapper.diagram.edit.parts.OperatorLeftConnectorEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.OperatorLeftConnectorEditPart(view);

			case dataMapper.diagram.edit.parts.InNode3EditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.InNode3EditPart(view);

			case dataMapper.diagram.edit.parts.OperatorRightContainerEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.OperatorRightContainerEditPart(view);

			case dataMapper.diagram.edit.parts.OperatorRightConnectorEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.OperatorRightConnectorEditPart(view);

			case dataMapper.diagram.edit.parts.OutNode3EditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.OutNode3EditPart(view);

			case dataMapper.diagram.edit.parts.DataMapperLinkEditPart.VISUAL_ID:
				return new dataMapper.diagram.edit.parts.DataMapperLinkEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
